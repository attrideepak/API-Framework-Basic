package test;

import listeners.StopExecutionOnFailure;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({StopExecutionOnFailure.class})
public class ListenerClassFour {

    int i = 0;

    @Test(invocationCount = 10)
    public void testSkipLogic(){
        if(i<2){
            Assert.assertEquals(i,i,"Test Passed");
            System.out.println("Passed");
        }else {
            Assert.fail("Test Failed ");
        }
        i++;
    }
}
