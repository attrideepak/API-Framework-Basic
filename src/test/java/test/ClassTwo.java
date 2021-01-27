package test;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
    @Test(groups = {"group-1"},invocationCount = 10)
    public void test1(){
        System.out.println("Test1 from Class2,group1,thread id "+ Thread.currentThread().getId());
        Assert.fail("Failed invocation");
    }

    @Test(groups = {"group-2"})
    public void test2(){
        System.out.println("Test2 from Class2,group2");
    }

    @Test(groups = {"group-3"})
    public void test3(){
        System.out.println("Test3 from Class2,group3");
    }

    @Test(groups = {"group-4"})
    public void test4(){
        System.out.println("Test4 from Class2,group4");
    }
    @Parameters({"testparam"})
    @Test()
    public void test5(String alpha){
        System.out.println("This is testparam "+alpha);
        System.out.println("Test5 from Class2");
    }

    @Parameters({"suiteparam"})
    @Test()
    public void test6(String beta){
        System.out.println("This is suite parama "+beta);
        System.out.println("Test6 from Class2");
    }

    @Parameters({"suiteparam"})
    @Test()
    public void test7(String gama){
        System.out.println("This is suite parama "+gama);
        System.out.println("Test7 from Class2");
    }

    @Parameters({"param1","param2"})
    @Test()
    public void test8(String one,String two){
        System.out.println("This is param one "+one);
        System.out.println("This is param two "+two);
        System.out.println("Test8 from Class2");
    }

    @Parameters({"option"})
    @Test()
    public void test9(@Optional("optional value" ) String gama){
        System.out.println("This is param is "+gama);
        System.out.println("Test9 from Class2");
    }
}
