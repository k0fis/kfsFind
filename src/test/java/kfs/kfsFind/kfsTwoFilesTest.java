package kfs.kfsFind;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class kfsTwoFilesTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public kfsTwoFilesTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(kfsTwoFilesTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void test1() {
        kfsTwoFiles tw = new kfsTwoFiles(15, 25);
        assertTrue("15 must be acxcepted", tw.accept(15));
        assertTrue("20 must be acxcepted", tw.accept(20));
        assertTrue("25 must be acxcepted", tw.accept(25));
        assertFalse("26 must not be acxcepted", tw.accept(26));
        assertFalse("14 must not be acxcepted", tw.accept(14));
    }

    public void test2() {
        kfsTwoFiles tw = new kfsTwoFiles(15, false, 25, true);
        assertFalse("15 must be acxcepted", tw.accept(15));
        assertTrue("20 must be acxcepted", tw.accept(20));
        assertTrue("25 must be acxcepted", tw.accept(25));
        assertFalse("26 must not be acxcepted", tw.accept(26));
        assertFalse("14 must not be acxcepted", tw.accept(14));
    }

    public void test3() {
        kfsTwoFiles tw = new kfsTwoFiles(15, false, 25, false);
        assertFalse("15 must be acxcepted", tw.accept(15));
        assertTrue("20 must be acxcepted", tw.accept(20));
        assertFalse("25 must be acxcepted", tw.accept(25));
        assertFalse("26 must not be acxcepted", tw.accept(26));
        assertFalse("14 must not be acxcepted", tw.accept(14));
    }

    public void test4() {
        kfsTwoFiles tw = new kfsTwoFiles(15, true, 25, false);
        assertTrue("15 must be acxcepted", tw.accept(15));
        assertTrue("20 must be acxcepted", tw.accept(20));
        assertFalse("25 must be acxcepted", tw.accept(25));
        assertFalse("26 must not be acxcepted", tw.accept(26));
        assertFalse("14 must not be acxcepted", tw.accept(14));
    }

}
