package test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class GetTestSample_2 {

    @Test
    public void getTest() {
            RequestSpecification specification = RestAssured.given();
            HashMap<String, String> queryParamMap = new HashMap<>();
            queryParamMap.put("platform", "android");
            queryParamMap.put("device_id", "dhsdjds");
            queryParamMap.put("city", "bangalore");
            specification.params(queryParamMap).log().all();
            Response response = specification.get(" https://api.zoomcar.com/v4/menus");
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(), 500, "Status is in correct");
            JsonPath jsonPath = new JsonPath(response.asString());
            System.out.println(jsonPath.getBoolean("show_deals"));
    }
}

