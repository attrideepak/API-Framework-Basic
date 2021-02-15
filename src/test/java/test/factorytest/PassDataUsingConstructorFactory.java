package test.factorytest;

import org.testng.annotations.Factory;

public class PassDataUsingConstructorFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new FactoryPassDataUsingConstructorTest(0), new FactoryPassDataUsingConstructorTest(1) };
    }
}
