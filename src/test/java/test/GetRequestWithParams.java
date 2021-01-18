package test;

import activity.GetRequestWithQueryParamActivity;
import core.api.ConfigInitializer;
import core.utils.GsonUtils;
import dataprovider.TestData;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.responsepojo.GetResponsePojo;

public class GetRequestWithParams extends ConfigInitializer {

    GetRequestWithQueryParamActivity getRequestWithQueryParamActivity = new GetRequestWithQueryParamActivity();


    @Epic("Get Request")
    @Feature("Get Request without params")
    @Step("Step 1")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dataProvider = "getTest",dataProviderClass = TestData.class)
    public void getRequestTest(String platform,String deviceId, String city) {
        Response response = getRequestWithQueryParamActivity.getRequestWithQueryParam(platform,deviceId,city);
        String apiResponse = response.prettyPrint();
        GetResponsePojo responsePojo = GsonUtils.fromJsonToJavaObject(apiResponse,GetResponsePojo.class);
        Assert.assertEquals(responsePojo.getStatus(),"1","Status does not match");
    }
}
