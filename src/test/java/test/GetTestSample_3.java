package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class GetTestSample_3 {

    @Test
    public void getTest(){
        RestAssured.baseURI = "https://api.zoomcar.com";
        HashMap<String, String> queryParamMap = new HashMap<>();
        queryParamMap.put("platform","android");
        queryParamMap.put("device_id","dhsdjds");
        queryParamMap.put("city","bangalore");
        RequestSpecification specification = RestAssured.given();
        specification.params(queryParamMap).log().all();
        Response response = specification.get("/v4/menus");
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),400,"Status is in correct");
    }
}
