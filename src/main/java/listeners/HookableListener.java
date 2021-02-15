package listeners;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class HookableListener implements IHookable {
    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        System.out.println("Execute this before any Test step is executed");
       callBack.runTestMethod(testResult);
    }
}
/*This interface skips the invocation of test methods and provides a run method which gets invoked instead of each @Test method found.
The test method is then invoked once the callBack() method of the IHookCallBack parameter is called.
 */

//It is utilized when you wish to perform testing on classes which require JAAS authentication. This can be used to set permissions, i.e.
// for whom the test method should run and when the test method should get skipped.*?The IHookable listener is