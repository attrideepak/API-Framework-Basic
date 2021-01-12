package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;

public class GetTestSample_2 {

    @Test
    public void getTest() {
        RequestSpecification specification = RestAssured.expect().then().with();
        HashMap<String, String> queryParamMap = new HashMap<>();
        queryParamMap.put("platform","android");
        queryParamMap.put("device_id","dhsdjds");
        queryParamMap.put("city","bangalore");
        specification.params(queryParamMap);
        Response response = specification.get(" https://api-test-f.zoomcarstaging.com/v4/menus");
        response.prettyPrint();
    }
}

