package test;

import activity.PostRequestWithJsonBodyActivity;
import core.api.ConfigInitializer;
import dataprovider.TestData;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostRequestWithJsonBody extends ConfigInitializer {

    PostRequestWithJsonBodyActivity postRequestWithJsonBodyActivity = new PostRequestWithJsonBodyActivity();

    @Test(dataProvider = "postTest",dataProviderClass = TestData.class)
    public void postTest(String name,String job){
        Response response = postRequestWithJsonBodyActivity.postRequestWithJson(name,job);
        System.out.println("\nResponse: ");
        response.prettyPrint();
    }
}
