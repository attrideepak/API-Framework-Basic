package test;

import DBConstants.DBConstants;
import activity.GetRequestWithoutQueryParamActivity;
import core.api.ConfigInitializer;
import core.utils.database.ExecuteDBQuery;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GatRequestWithoutParams extends ConfigInitializer {
    GetRequestWithoutQueryParamActivity getRequestWithoutQueryParamActivity = new GetRequestWithoutQueryParamActivity();

//    @BeforeTest
//    public void beforeTest() throws SQLException {
//        ExecuteDBQuery executeDBQuery = new ExecuteDBQuery();
//        ResultSet resultSet = null;
//        resultSet = executeDBQuery.executeQuery(DBConstants.getAirportTermonalDetails(-1));
//
//            String description = resultSet.getString("DESCRIPTION");
//            Assert.assertTrue(description!=null,"description is not null");
//
//    };  //failing @before* method to test configfailurepolicy in testng xml

    @Epic("Get Request")
    @Feature("Get Request without params")
    @Step("Step 1")
    @Test()
    public void getTest(){
        Response response = getRequestWithoutQueryParamActivity.getRequestWithoutQueryParam();
        response.prettyPrint();
        System.out.println("Status ----------- "+ response.statusCode());
        System.out.println("content ----------- "+ response.contentType());
        response.then().assertThat().statusCode(400);
        Assert.fail("Response is 400");
//        System.out.println("returning values");
//        return "allow";
    }

    @Test(enabled = false)
    public void getTest1(){
        Response response = getRequestWithoutQueryParamActivity.getRequestWithoutQueryParam();
        response.prettyPrint();
        System.out.println("Second Test");
    }

    @Test(enabled = false)
    public void getTest2(){
        Response response = getRequestWithoutQueryParamActivity.getRequestWithoutQueryParam();
        response.prettyPrint();
        System.out.println("Third Test");
    }

    @Test(enabled = false)
    public void getTest3(){
        Response response = getRequestWithoutQueryParamActivity.getRequestWithoutQueryParam();
        response.prettyPrint();
        System.out.println("Fourth Test");
    }
}
