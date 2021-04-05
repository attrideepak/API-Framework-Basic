package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class SampleTest {

    public static void postCall() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();  //from org.simple
        requestParams.put("name", "Ramu");
        requestParams.put("job", "manager");
        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
        String response = request.post().prettyPrint();
    }

    public static void postCallWithStringBody(){
        String name = "\"Ramu\"";
        String job = "\"VP\"";
        String requestBody = "{\"name\":"+name+"," +
                                "\"Job\":"+job+"}";
        System.out.println(requestBody);
        RestAssured.baseURI = "https://reqres.in/api/users";
        RestAssured.given()
                .header("Content-Type","application/json")
                .body(requestBody)
                .post()
                .prettyPrint();
    }

    public static void main(String[] args) {
        postCallWithStringBody();
    }
}
