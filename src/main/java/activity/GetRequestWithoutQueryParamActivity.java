package activity;

import core.api.ApiCore;
import core.utils.TestEnvironment;
import core.utils.ApiEndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;


public class GetRequestWithoutQueryParamActivity {

    ApiCore apiCore = new ApiCore();

    @Step("Step 2")
    public Response getRequestWithoutQueryParam(){
        Response response = apiCore.triggerGetRequestWithoutParam(TestEnvironment.DOMAIN.getValue()+ ApiEndPoints.MENU.getPath());
        return response;
    }

}
