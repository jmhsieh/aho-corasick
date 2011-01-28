package org.arabidopsis.ahocorasick;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {
    public static Test suite() {
	TestSuite suite = new TestSuite();
	suite.addTestSuite(TestState.class);
	suite.addTestSuite(TestAhoCorasick.class);
	suite.addTestSuite(TestQueue.class);
	return suite;
    }
}
