package test;

import annotations.Retriable;
import listeners.RetryAnalyzer;
import listeners.RetryConfigurationFailure;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ListenerClassThree extends RetryConfigurationFailure {

    private int counter = 1;

    @BeforeMethod
    @Retriable(attempts = 4)
    public void beforeMethod() {
        if (counter <= 3) {
            String msg = "Simulating a failure for attempt " + counter++;
            System.err.println(msg);
            Assert.fail(msg);
        }
        Assert.assertTrue(true,"Finally the configuration passed");
    }

    @Test
    public void test1() {
      Assert.assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
    }


    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void retryTestOne(){
        if(counter<=2) {
            Assert.assertEquals(true, false);
        }else {
            Assert.assertEquals(true,true);
        }
        counter++;
    }

    @Retriable(attempts = 4)
    @Test
    public void retryTestTwo(){
        Assert.assertEquals(true,true);
    }
}
