package test;

import org.testng.annotations.Test;

public class ClassOne {


    @Test(groups = {"group-4"})
    public void test1() {
        System.out.println("Test1 from Class1,group4");
    }

    @Test(groups = "group-3")
    public void test2() {
        System.out.println("Test2 from Class1,group3");
    }

    @Test(groups = {"group-1","group-2"})
    public void test3() {
        System.out.println("Test3 from Class1,group1,group2");
    }

    @Test(groups = {"group-1"})
    public void test4() {
        System.out.println("Test4 from Class1,group1");
    }

    @Test(groups = {"group-2"})
    public void test5() {
        System.out.println("Test5 from Class1,group2");
    }

}
