package at.ac.uibk.qe.artemis.leaky.tests;

import at.ac.uibk.qe.artemis.leaky.LeakyBucketPatternInterface;
import at.ac.uibk.qe.artemis.leaky.PotentiallyFaultyPacket;
import at.ac.uibk.qe.artemis.leaky.logic.PacketChecker;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;


/**
 * @author Michael Breu
 * @version 1.1 (02.11.20)
 */
@SuppressWarnings("Duplicates")
public class LeakyBehaviorTest  {


	@Test()
	@Timeout(2)
	public void onlyGoodPackages()   {
		PacketChecker checker = new PacketChecker();
		var goodPacket = new PotentiallyFaultyPacket(false);
		checker.setErrorRate(5);
		for (int i = 0; i < 100; i++) {
			try {
				checker.receivePacket(goodPacket);
			} catch (LeakyBucketPatternInterface.TooManyErrorsException e) {
				Assert.fail();
			}
		}
		Assert.assertTrue(true);
	}

	@Test()
	@Timeout(2)
	public void dontSetErrorRateOnlyGood()   {
		PacketChecker checker = new PacketChecker();
		var goodPacket = new PotentiallyFaultyPacket(false);
		for (int i = 0; i < 100; i++) {
			try {
				checker.receivePacket(goodPacket);
			} catch (LeakyBucketPatternInterface.TooManyErrorsException e) {
				Assert.fail();
			}
		}
		Assert.assertTrue(true);
	}

	@Test()
	@Timeout(2)
	public void dontSetErrorRateOneBad()   {
		PacketChecker checker = new PacketChecker();
		try {
			checker.receivePacket(new PotentiallyFaultyPacket(true));
			Assert.fail();
		} catch (LeakyBucketPatternInterface.TooManyErrorsException e) {
			Assert.assertTrue(true);
		}
	}

	@Test()
	@Timeout(2)
	public void SendTooManyBadPackages()   {
		PacketChecker checker = new PacketChecker();
		checker.setErrorRate(3);

		try {
			checker.receivePacket(new PotentiallyFaultyPacket(true));

			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));


			checker.receivePacket(new PotentiallyFaultyPacket(true));

			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));

			checker.receivePacket(new PotentiallyFaultyPacket(true));

			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));

			checker.receivePacket(new PotentiallyFaultyPacket(true));

			Assert.fail();
		} catch (LeakyBucketPatternInterface.TooManyErrorsException e) {
			Assert.assertTrue(true);
		}
	}


	@Test()
	@Timeout(2)
	public void SendPackagesWithSomeDelay()   {
		PacketChecker checker = new PacketChecker();
		checker.setErrorRate(3);

		try {
			checker.receivePacket(new PotentiallyFaultyPacket(true));

			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));


			checker.receivePacket(new PotentiallyFaultyPacket(true));

			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));

			checker.receivePacket(new PotentiallyFaultyPacket(true));

			TimeUnit.MILLISECONDS.sleep(1200);


			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));
			checker.receivePacket(new PotentiallyFaultyPacket(false));

			checker.receivePacket(new PotentiallyFaultyPacket(true));
			checker.receivePacket(new PotentiallyFaultyPacket(true));
			checker.receivePacket(new PotentiallyFaultyPacket(true));
			Assert.assertTrue(true);
		} catch (LeakyBucketPatternInterface.TooManyErrorsException e) {
			Assert.fail();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
