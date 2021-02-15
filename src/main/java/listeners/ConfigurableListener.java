package listeners;

import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;
import org.testng.internal.IConfiguration;

//IConfigurable interface can be implemented to configure all “Configurable annotations” eg. @BeforeSuite, @BeforeTest etc.
public class ConfigurableListener implements IConfigurable {
    @Override
    public void run(IConfigureCallBack callBack, ITestResult testResult) {
        System.out.println("Execute this before any configuration steps gets executed");
        callBack.runConfigurationMethod(testResult);
    }
}
