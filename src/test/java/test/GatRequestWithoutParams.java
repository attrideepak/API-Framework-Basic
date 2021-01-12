package test;

import activity.GetRequestWithoutQueryParamActivity;
import core.api.ConfigInitializer;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GatRequestWithoutParams extends ConfigInitializer {
    GetRequestWithoutQueryParamActivity getRequestWithoutQueryParamActivity = new GetRequestWithoutQueryParamActivity();

    @Test
    public void getTest(){
        Response response = getRequestWithoutQueryParamActivity.getRequestWithoutQueryParam();
        response.prettyPrint();
        System.out.println("Status ----------- "+ response.statusCode());
        System.out.println("content ----------- "+ response.contentType());
        response.then().assertThat().statusCode(400).and().assertThat().contentType("fgfg");
    }
}
