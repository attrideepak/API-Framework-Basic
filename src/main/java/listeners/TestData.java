package listeners;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "getData")
    public Object[][] getTestWithParams(){
        return new Object[][]{
                {"Android"}
        };
    }

}
