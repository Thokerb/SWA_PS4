package at.ac.uibk.qe.artemis.leaky.tests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(value = LeakyBehaviorTest.class)
public class LeakyTestSuite {

}
