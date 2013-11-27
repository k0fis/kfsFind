package kfs.kfsFind;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class kfsOneFileTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public kfsOneFileTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(kfsOneFileTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void test1() {
        kfsOneFile tw = new kfsOneFile(15);
        assertTrue("Older 14 must be acxcepted", tw.acceptOlder(14));
        assertTrue("Older 15 must be acxcepted", tw.acceptOlder(15));
        assertFalse("Older 20 must NOT be acxcepted", tw.acceptOlder(20));
    
        assertFalse("Newer 14 must NOT be acxcepted", tw.acceptNewer(14));
        assertTrue("Newer 15 must be acxcepted", tw.acceptNewer(15));
        assertTrue("Newer 20 must be acxcepted", tw.acceptNewer(20));

    }

    public void test2() {
        kfsOneFile tw = new kfsOneFile(15, false);
        assertTrue("Older 14 must be acxcepted", tw.acceptOlder(14));
        assertFalse("Older 15 must NOT be acxcepted", tw.acceptOlder(15));
        assertFalse("Older 20 must NOT be acxcepted", tw.acceptOlder(20));
    
        assertFalse("Newer 14 must NOT be acxcepted", tw.acceptNewer(14));
        assertFalse("Newer 15 must NOT be acxcepted", tw.acceptNewer(15));
        assertTrue("Newer 20 must be acxcepted", tw.acceptNewer(20));

    }

}
