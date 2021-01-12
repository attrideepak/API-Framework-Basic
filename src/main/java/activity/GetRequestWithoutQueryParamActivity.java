package activity;

import core.api.ApiCore;
import core.api.TestEnvironment;
import core.utils.ApiEndPoints;
import io.restassured.response.Response;


public class GetRequestWithoutQueryParamActivity {

    ApiCore apiCore = new ApiCore();

    public Response getRequestWithoutQueryParam(){
        Response response = apiCore.triggerGetRequestWithoutParam(TestEnvironment.DOMAIN.getValue()+ ApiEndPoints.MENU.getPath());
        return response;
    }

}
