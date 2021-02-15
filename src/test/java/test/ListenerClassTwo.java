package test;

import listeners.ConfigurationListener;
import listeners.InvokedMethodListener;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ConfigurationListener.class})
public class ListenerClassTwo {

    @BeforeClass
    public void beforeClass(){
        System.out.println("********** Before Class ***********");
        Assert.assertTrue(1==1);
    }

    @Test
    public void testa(String param){
        System.out.println("************ testa method ***********");
        System.out.println("************ param value "+param);
    }

    @Test
    public void testb(String param){
        System.out.println("************ testb method ***********");
        System.out.println("************ param value "+param);
    }

    @Test
    public void testc(){
        System.out.println("************ testc method ***********");
    }

    @Test
    public void testd(){
        System.out.println("************ testd method ***********");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("************ After class ************");
        Assert.fail("Failed");
    }
}
