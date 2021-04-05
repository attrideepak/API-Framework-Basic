package listeners;

import annotations.Retriable;
import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;

//For retrying a config failed method

public class RetryConfigurationFailure implements IConfigurable {


    @Override
    public void run(IConfigureCallBack callBack, ITestResult testResult) {
        Retriable retriable =
                testResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Retriable.class);
        int attempts = 1;
        if (retriable != null) {
            attempts = retriable.attempts();
        }
        for (int attempt = 1; attempt <= attempts; attempt++) {
            callBack.runConfigurationMethod(testResult);
            if (testResult.getThrowable() == null) {
                break;
            }
        }
    }
    }

