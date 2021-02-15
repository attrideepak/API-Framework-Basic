package listeners;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MethodInterceptorListeneer implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        List<IMethodInstance> result = new ArrayList<IMethodInstance>();
        for (IMethodInstance method : methods) {
            Test testMethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
            Set<String> groups = new HashSet<String>();
            for (String group : testMethod.groups()) {
                groups.add(group);
            }
            if (testMethod.priority() == 1 && groups.contains("regression")) {
                result.add(method);
            }
        }
        return result;
    }
    //The above will execute only tests which has 'priority=1' and group value as 'regression'.
}

//    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
//        List<IMethodInstance> result = new ArrayList<IMethodInstance>();
//        for (IMethodInstance method : methods) {
//            Test testMethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
//            if (testMethod.priority() == 1) {
//                result.add(method);
//            }
//        }
//        return result;
//    }
// for running methods with priority 1