package test;

import org.testng.annotations.Test;

@Test(groups={"default-group"})
public class ClassThree {

    public void test1() {
        System.out.println("Test1 from Class3");
    }


    public void test2() {
        System.out.println("Test2 from Class3");
    }


    public void test3() {
        System.out.println("Test3 from Class3");
    }

    @Test(groups = {"group-1"})
    public void test4() {
        System.out.println("Test4 from Class3,group1");
    }


    public void test5() {
        System.out.println("Test5 from Class3");
    }
}
