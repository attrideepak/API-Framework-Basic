package listeners;

/*Problem Statement : A test which has been set with invocationCount=10 (say), failed 4 times.  In such a situation, it makes sense to stop execution for
this particular testcase and save further execution resources.
 */

import org.testng.*;
import org.testng.internal.TestResult;

import java.util.LinkedHashMap;
import java.util.Map;

public class StopExecutionOnFailure implements IInvokedMethodListener {

    static Map<String, Integer> methodFailCount = new LinkedHashMap<>();
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        //If the failure count for this method has surpassed the set limit,
        //skip the next execution
        String methodName = method.getTestMethod().getMethodName();
        if(methodFailCount.get(methodName)!= null && methodFailCount.get(methodName) > 4) {
            System.out.println("Test skipped");
            throw new SkipException("Skipped due to failure count > 4");
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        String methodName = method.getTestMethod().getMethodName();

        //If test has failed, add to fail count
        if(testResult.getStatus() == TestResult.FAILURE){
            if(methodFailCount.get(methodName ) == null)
                methodFailCount.put(methodName,1);
            else{
                methodFailCount.put(methodName, methodFailCount.get(methodName)+1);
            }

        }
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {

    }
}
