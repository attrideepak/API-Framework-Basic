package activity;

import core.api.ApiCore;
import core.utils.ApiEndPoints;
import core.utils.GsonUtils;
import io.restassured.response.Response;
import pojo.requestpojo.PostRequestPojo;

public class PostRequestWithJsonBodyActivity {
    ApiCore apiCore = new ApiCore();




    public Response postRequestWithJson(String name,String job){
        PostRequestPojo postRequestPojo = new PostRequestPojo();
        postRequestPojo.setName(name);
        postRequestPojo.setJob(job);
        Response response = apiCore.triggerPostRequestWithJsonBody(ApiEndPoints.POSTREQUEST.getPath(),postRequestPojo);
        return response;

    }
}
