package test.factorytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProviderTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class executed");
    }

    @Test(dataProvider = "dataMethod")
    public void testMethod(String param) {
        System.out.println("The parameter value is: " + param);
    }

    @DataProvider
    public Object[][] dataMethod() {
        return new Object[][] { { "one" }, { "two" } };
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class executed");
    }
}


//  you can see from the preceding test results the class beforeClass() and afterClass() is executed only one time irrespective of how many times
//  the test method is executed.
