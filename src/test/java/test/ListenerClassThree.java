package test;

import annotations.RetryCountIfFailed;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListenerClassThree {
    int counter = 2;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void retryTest(){
        Assert.assertEquals(true,true);
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

    @RetryCountIfFailed(5)
    @Test
    public void retryTestTwo(){
        Assert.assertEquals(true,true);
    }
}
