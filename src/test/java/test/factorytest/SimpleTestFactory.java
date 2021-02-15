package test.factorytest;

import org.testng.annotations.Factory;

public class SimpleTestFactory {
        @Factory
        public Object[] factoryMethod() {
        return new Object[] {
                new SimpleFactoryTest("one"),
                new SimpleFactoryTest("two")
        };
    }
}
// the beforeClass() and afterclass() method is executed before each execution of testMethod(). This shows that factory implementation executes the test method for
// each individual instance of the test class.