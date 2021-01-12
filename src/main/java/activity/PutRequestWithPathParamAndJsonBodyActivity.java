package activity;

import core.api.ApiCore;
import core.utils.ApiEndPoints;
import core.utils.EnvironmentEndPoint;
import io.restassured.response.Response;
import pojo.requestpojo.PutRequestPojo;

public class PutRequestWithPathParamAndJsonBodyActivity {

    ApiCore apiCore = new ApiCore();

    public Response putRequest(String id, String name, String job){
        PutRequestPojo putRequestPojo = new PutRequestPojo();
        putRequestPojo.setName(name);
        putRequestPojo.setJob(job);
        Response response = apiCore.triggerPutRequestWithPathParamAndJsonBody(ApiEndPoints.PUTREQUEST.getPath()+id,putRequestPojo);
        return response;


    }

    public Response putRequestNew(String id, String name, String job){
        PutRequestPojo putRequestPojo = new PutRequestPojo();
        putRequestPojo.setName(name);
        putRequestPojo.setJob(job);
        Response response = apiCore.triggerPutRequestWithPathParamAndJsonBody(EnvironmentEndPoint.reqres,ApiEndPoints.PUTTEST.getPath(),id,putRequestPojo);
        return response;


    }


}
