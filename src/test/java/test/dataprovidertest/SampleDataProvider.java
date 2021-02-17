package test.dataprovidertest;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.Iterator;

public class SampleDataProvider {


//    public SampleDataProvider(String s) {
//        System.out.println("Parameterised constructor");
//    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod (Method m){
        switch (m.getName()) {
            case "Sum":
                return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
            case "Diff":
                return new Object[][] {{2, 3, -1}, {5, 7, -2}};
        }
        return null;
    }

    @DataProvider(name = "dataMethod")
    public Object[] dataMethod() {
        Object[] data = {
                "one",
                "two"
        };
        return data;
    }

    @DataProvider(name = "dataMethod1")
    public Object[][] dataMethod1() {
        Object[][] data = {
                {"one"},
                {"two"}
        };
        return data;
    }

    @DataProvider(name = "dataMethod2")
    public Iterator<Object> dataMethod2() {

        return null;
    }

    @DataProvider(name = "dataMethod3")
    public Iterator<Object[]> dataMethod3() {

        return null;
    }
}


