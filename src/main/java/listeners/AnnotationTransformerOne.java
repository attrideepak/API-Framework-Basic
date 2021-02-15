package listeners;

import org.testng.IAnnotationTransformer;
import org.testng.IDataProviderListener;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class AnnotationTransformerOne implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if(testMethod.getName().equalsIgnoreCase("testa")){
            System.out.println("set data provider for " + testMethod.getName());
            annotation.setDataProviderClass(TestData.class);
            annotation.setDataProvider("getData");
        }
        else if (testMethod.getName().equals("testb")){
            System.out.println("set data provider for " + testMethod.getName());
            annotation.setInvocationCount(5);
            annotation.setDataProviderClass(TestData.class);
            annotation.setDataProvider("getData");
        }
        else{
            annotation.setEnabled(false);
        }

    }

    @Override
    public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
    }

    @Override
    public void transform(IDataProviderAnnotation annotation, Method method) {

    }

    @Override
    public void transform(IFactoryAnnotation annotation, Method method) {

    }

    @Override
    public void transform(IListenersAnnotation annotation, Class<?> testClass) {

    }
}
