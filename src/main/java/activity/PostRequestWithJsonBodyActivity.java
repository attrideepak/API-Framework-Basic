package activity;

import core.api.ApiCore;
import core.utils.TestEnvironment;
import core.utils.ApiEndPoints;
import io.restassured.response.Response;
import pojo.requestpojo.PostRequestPojo;

public class PostRequestWithJsonBodyActivity {
    ApiCore apiCore = new ApiCore();


    public Response postRequestWithJson(String name,String job){
        PostRequestPojo postRequestPojo = new PostRequestPojo();
        postRequestPojo.setName(name);
        postRequestPojo.setJob(job);
        Response response = apiCore.triggerPostRequestWithJsonBody(TestEnvironment.DOMAIN.getValue()+ApiEndPoints.POSTREQUEST.getPath(),postRequestPojo);
        return response;

    }
}
