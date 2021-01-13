package core.api;
import core.utils.GsonUtils;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

public class ApiCore {

    public Response triggerGetRequestWithParam(String url, HashMap<String, String> paramMap){
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.addQueryParams(paramMap);
        RequestSpecification requestSpecification = requestSpecBuilder.build().log().all();
        Response response = RestAssured.given().spec(requestSpecification).get(url);
       // Response response = RestAssured.given().spec(requestSpecification).request(Method.GET,url); ---> This also works
        //Response response = RestAssured.given(requestSpecification).get(url);   --->This also works
        return  response;
    }

    public Response triggerGetRequestWithoutParam(String url){
        Response response = RestAssured.given().log().all().get(url);
        return  response;
    }

    public Response triggerPostRequestWithJsonBody(String url, Object obj){
        System.out.println("API Url: "+url+"\n");

        String json = GsonUtils.toJsonFromJavaObject(obj);

        System.out.println("Request Body: \n"+json+"\n");
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(json);
        requestSpecBuilder.setContentType(ContentType.JSON);

        RequestSpecification requestSpecification = requestSpecBuilder.build().log().all();
        Response response = RestAssured.given().spec(requestSpecification).post(url);
        return response;
    }

    public Response triggerPutRequestWithPathParamAndJsonBody(String url,Object obj){
        String json = GsonUtils.toJsonFromJavaObject(obj);

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBody(json);
        requestSpecBuilder.setContentType(ContentType.JSON);

        RequestSpecification requestSpecification = requestSpecBuilder.build().log().all();
        Response response = RestAssured.given().spec(requestSpecification).put(url);
        return response;
    }

    public Response triggerPutRequestWithPathParamAndJsonBody(String basePath,String baseUri,String id,Object obj){
        String url = basePath+baseUri;

        String json = GsonUtils.toJsonFromJavaObject(obj);
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBasePath(url);
        requestSpecBuilder.addPathParam("id",id);
        requestSpecBuilder.setBody(json);
        requestSpecBuilder.setContentType(ContentType.JSON);

        RequestSpecification requestSpecification = requestSpecBuilder.build().log().all();

        Response response = RestAssured.given().spec(requestSpecification).put(url);
        return response;
    }
}
