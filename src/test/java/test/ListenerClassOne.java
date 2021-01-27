package test;

import listeners.TestListener;
import listeners.ReportListener;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class, ReportListener.class})
public class ListenerClassOne {

    int i = 0;

    @Test //success test
    public void test1() {
        Assert.assertEquals("xxxxxx","xxxxxx");
        System.out.println("*********** Test successful ************");
    }

    @Test //failure test
    public void test2() {
        Assert.fail("Test failed");
        System.out.println("*********** Test failed ************");
    }

    @Test //skip test
    public void test3() {
        System.out.println("*********** Test skipped ************");
        throw new SkipException("Test case skipped");
    }

    @Test(successPercentage = 60, invocationCount = 3)//Failing Within Success
    public void test4() {
        if(i < 2) {
            Assert.assertEquals(i, i);
        }else {
            Assert.fail("Test Failed");
        }
        i++;
        System.out.println("*********** Failing Within Success *********");

    }

    @Test(timeOut = 3) //onTestFailedWithTimeout
    public void test5() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("********* TestFailedWithTimeout **********");
    }
}
