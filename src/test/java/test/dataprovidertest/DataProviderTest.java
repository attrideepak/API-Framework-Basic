package test.dataprovidertest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data-provider",dataProviderClass = SampleDataProvider.class,enabled = false)
    public void Sum (int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }

    @Test (dataProvider = "data-provider",dataProviderClass = SampleDataProvider.class,enabled = false)
    public void Diff (int a, int b, int result) {
        int diff = a - b;
        Assert.assertEquals(result, diff);
    }

    @Test(dataProvider = "dataMethod",dataProviderClass = SampleDataProvider.class)
    public void testMethod(String param) {
        System.out.println("The parameter value is: " + param);
    }

}
