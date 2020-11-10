package at.ac.uibk.qe.artemis.leaky.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 * @author Michael Breu
 * @version 1.1 (02.11.20)
 */
public class LeakyBehaviorTest  {


	@Test()
	@Timeout(2)
	public void test1()   {
		Assertions.fail("Hier sollte Ihr Test stehen");
	}


}
