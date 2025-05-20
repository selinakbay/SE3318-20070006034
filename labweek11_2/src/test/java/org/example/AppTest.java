package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for App.
 */
public class AppTest extends TestCase {

    /**
     * Test case constructor.
     *
     * @param testName test name
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * Returns the suite of tests being tested.
     *
     * @return test suite
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Basic test.
     */
    public void testApp() {
        assertTrue(true);
    }
}
