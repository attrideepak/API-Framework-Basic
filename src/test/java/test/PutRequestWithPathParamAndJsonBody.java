package test;

import activity.PutRequestWithPathParamAndJsonBodyActivity;
import core.api.ApiCore;
import core.api.ConfigInitializer;
import dataprovider.TestData;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.requestpojo.PutRequestPojo;

public class PutRequestWithPathParamAndJsonBody extends ConfigInitializer {

    PutRequestWithPathParamAndJsonBodyActivity putRequest = new PutRequestWithPathParamAndJsonBodyActivity();
    ApiCore apiCore = new ApiCore();

    @Test(dataProvider = "putTest",dataProviderClass = TestData.class)
    public void putRequestTest(String id, String name, String job){
        Response response = putRequest.putRequest(id,name,job);
        System.out.println("\nResponse: ");
        response.prettyPrint();
    }

    @Test(dataProvider = "putTest",dataProviderClass = TestData.class)
    public void putTestNew(String id, String name, String job){
        Response response = putRequest.putRequestNew(id, name, job);
        System.out.println("\nResponse: ");
        response.prettyPrint();
    }
}
