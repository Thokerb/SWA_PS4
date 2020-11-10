package at.ac.uibk.qe.artemis.leaky;

import java.io.IOException;

/**
 * interface for a
 * 
 * @author Michael Breu
 *
 */
public interface LeakyBucketPatternInterface {

	/**
	 * Simple interface for a potentially faulty packet.
	 * 
	 * @author Michael Breu
	 *
	 */
	public interface Packet {
		/**
		 * payload is not relevant in our context.
		 * 
		 * @return
		 */
		public byte[] payLoad();
	}

	/**
	 * Simple interface for a potentially faulty packet.
	 * 
	 * @author Michael Breu
	 *
	 */
	public interface PotentiallyFaultyPacket extends Packet {
		/**
		 * returns true, if the current packet is faulty.
		 * 
		 * @return true, if the current packet is faulty.
		 */
		public boolean isFaulty();
	}
	
	/**
	 * thrown if stream contains too many faulty packets.
	 *
	 */
	public class TooManyErrorsException extends IOException {

	}


	/**
	 * initializes the receiver, to throw an error, if the given errors per seconds is exceeded.
	 * @param errorRatePer_msec the rate of faulty packets per second.
	 */
	public void setErrorRate(int errorsPerSec);
	/**
	 * interface to receive a packet.
	 * 
	 * @param potentiallyFaultyPacket the packet to receive
	 */
	public void receivePacket(PotentiallyFaultyPacket potentiallyFaultyPacket) throws TooManyErrorsException;
	
	
}
