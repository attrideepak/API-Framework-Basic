package listeners;

import org.testng.IConfigurationListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ConfigurationListener implements IConfigurationListener {
    @Override
    public void onConfigurationSuccess(ITestResult tr) {
        System.out.println("********* Success ************* "+ tr.getStatus());
    }

    @Override
    public void onConfigurationSuccess(ITestResult tr, ITestNGMethod tm) {

    }

    @Override
    public void onConfigurationFailure(ITestResult tr) {
        System.out.println("********* Failure ************* "+ tr.getStatus());
    }

    @Override
    public void onConfigurationFailure(ITestResult tr, ITestNGMethod tm) {

    }

    @Override
    public void onConfigurationSkip(ITestResult tr) {

    }

    @Override
    public void onConfigurationSkip(ITestResult tr, ITestNGMethod tm) {

    }

    @Override
    public void beforeConfiguration(ITestResult tr) {

    }

    @Override
    public void beforeConfiguration(ITestResult tr, ITestNGMethod tm) {

    }
}
