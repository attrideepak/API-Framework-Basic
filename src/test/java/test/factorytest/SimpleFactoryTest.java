package test.factorytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleFactoryTest {
    private String param = "";

    public SimpleFactoryTest(String param) {
        this.param = param;
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before SimpleTest class executed.");
    }

    @Test
    public void testMethod() {
        System.out.println("testMethod parameter value is: " + param);
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class executed");
    }
}

