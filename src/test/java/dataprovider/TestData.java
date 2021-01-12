package dataprovider;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "getTest")
    public Object[][] getTestWithParams(){
        return new Object[][]{
                {"Android","hgvhghgvhgv","Bangalore"}
        };
    }

    @DataProvider(name = "postTest")
    public Object[][] postTestWithJson(){
        return new Object[][]{
                {"Mark","Devloper"}
        };
    }

    @DataProvider(name = "putTest")
    public Object[][] putTestWithJson(){
        return new Object[][]{
                {"6","cooper","physicist"}
        };
    }
}
