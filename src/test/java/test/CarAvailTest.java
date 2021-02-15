package test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarAvailTest {
    @Test
    public void sampleTest(){
        RestAssured.baseURI = "http://non-prod-inventory5.zoomcartest.com:8080";
        Integer carId = 9762;



        Response response = RestAssured.given().log().all().pathParam("carId", carId).
                when().get("/inventory/availability/car/{carId}");

        CarAvailabilityById[] arr = response.as(CarAvailabilityById[].class);  // 1st way
        List<CarAvailabilityById> list = new ArrayList<>(Arrays.asList(arr));



       // List<CarAvailabilityById>list = Arrays.asList(response.as(CarAvailabilityById[].class, ObjectMapperType.JACKSON_2));  //this will also work

        System.out.println(list.toString());

         //ObjectMapper objectMapper = new ObjectMapper(); //this will also work, you will need jackson libraries for this
        // List<CarAvailabilityById> list = objectMapper.readValue(response.asString(), new TypeReference<List<CarAvailabilityById>>() {});

         Assert.assertEquals(list.get(0).getCarId(), carId, "carID didn't match");
    }

}
