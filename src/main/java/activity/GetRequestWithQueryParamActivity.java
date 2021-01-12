package activity;

import core.api.ApiCore;
import core.utils.ApiEndPoints;
import io.restassured.response.Response;

import java.util.HashMap;

public class GetRequestWithQueryParamActivity {
    ApiCore apiCore = new ApiCore();

    public Response getRequestWithQueryParam(String platform, String deviceid, String city){

        HashMap<String, String> queryParamMap = new HashMap<>();
        queryParamMap.put("platform",platform);
        queryParamMap.put("device_id",deviceid);
        queryParamMap.put("city",city);

        Response response = apiCore.triggerGetRequestWithParam(ApiEndPoints.MENU.getPath(),queryParamMap);
        return response;
    }


}
