package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("New Test Started " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Method " +result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method " +result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Method " +result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) { //This method invokes when the test method fails as a whole but has passed a certain success percentage, which is defined by the user.
        System.out.println("onTestFailedButWithinSuccessPercentage " +result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout " +result.getName());
    }

    @Override
    public void onStart(ITestContext context) {//This method invokes when the test class is instantiated and before executing any test method.
        System.out.println("onStart method started");
    }

    @Override
    public void onFinish(ITestContext context) {//This method invokes when all the test methods have run, and calling of all of their configuration methods happens.
        System.out.println("onFinish method started");
    }
}
