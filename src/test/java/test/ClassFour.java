package test;

import org.testng.annotations.*;

public class ClassFour {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Running before suite class 5 Thread id "+Thread.currentThread().getId());
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Running before suite class 4, Thread id "+Thread.currentThread().getId());
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Running before class, class 4 Thread id "+Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Running before method, class 4 Thread id "+Thread.currentThread().getId());
    }

    @Test
    public void testone(){
        System.out.println("Running test one, class 4 Thread id "+Thread.currentThread().getId());
    }

    @Test
    public void testtwo(){
        System.out.println("Running test two, class 4 Thread id "+Thread.currentThread().getId());
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Running after method, class 4 Thread id "+Thread.currentThread().getId());
    }
}
