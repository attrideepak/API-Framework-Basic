package listeners;

import com.google.common.base.Optional;
import org.testng.IResultMap;
import org.testng.IRetryAnalyzer;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static int maxTry = 3;
    /*
     * (non-Javadoc)
     * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
     *
     * This method decides how many times a test needs to be rerun.
     * TestNg will call this method every time a test fails. So we
     * can put some code in here to decide when to rerun the test.
     *
     * Note: This method will return true if a tests needs to be retried
     * and false it not.
     *
     */


    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                      //Check if test not succeed
            if (count < maxTry) {                            //Check if maxtry count is reached
                count++;                                     //Increase the  count by 1
                return true;                                 //Tells TestNG to re-run the test
            }

        }
        return false;
    }



}
