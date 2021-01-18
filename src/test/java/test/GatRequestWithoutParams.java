package test;

import activity.GetRequestWithoutQueryParamActivity;
import core.api.ConfigInitializer;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GatRequestWithoutParams extends ConfigInitializer {
    GetRequestWithoutQueryParamActivity getRequestWithoutQueryParamActivity = new GetRequestWithoutQueryParamActivity();

    @Epic("Get Request")
    @Feature("Get Request without params")
    @Step("Step 1")
    @Test
    public void getTest(){
        Response response = getRequestWithoutQueryParamActivity.getRequestWithoutQueryParam();
        response.prettyPrint();
        System.out.println("Status ----------- "+ response.statusCode());
        System.out.println("content ----------- "+ response.contentType());
        response.then().assertThat().statusCode(400);
        Assert.fail("Response is 400");
    }
}
