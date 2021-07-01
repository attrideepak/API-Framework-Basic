package test.factorytest;

import org.testng.annotations.DataProvider;

public class DataHelper {

    @DataProvider(name = "dataMethodOne")
    public Object[][] dataMethodOne() {
        return new Object[][] {
                { "Row->1",1,2,3,4},
                { "Row->2",10,9,8,7},
        };
    }
}
