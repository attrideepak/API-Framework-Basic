package test;

import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import pojo.responsepojo.NamePojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrgJson {

    String jsonString;
    JSONArray jsonArray;

    @Test
    public void createJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Mike");
        jsonObject.put("LastName","Tyson");
        jsonString = jsonObject.toString();
        System.out.println(jsonObject);
    }

    @Test
    public void createJsonArray(){
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Mike");
        jsonObject.put("LastName","Tyson");

        JSONObject jsonObject1 =new JSONObject();
        jsonObject1.put("Name","Charlie");
        jsonObject1.put("LastName","Chaplin");

        jsonArray.put(jsonObject);
        jsonArray.put(jsonObject1);
        System.out.println(jsonArray);
    }

    @Test
    public void createJsonArrayFromBean(){
        NamePojo namePojo = new NamePojo();
        namePojo.setName("Mike");
        namePojo.setLastName("Tyson");

        NamePojo namePojo1 = new NamePojo();
        namePojo1.setName("Charlie");
        namePojo1.setLastName("Chaplin");

        List<NamePojo> list = new ArrayList<>();
        list.add(namePojo);
        list.add(namePojo1);
         jsonArray = new JSONArray(list);

        System.out.println(jsonArray);
    }

    @Test
    public void createJsonFromMap(){
        Map<String,String> map = new HashMap<>();
        map.put("Name","Charlie");
        map.put("lastName","Chaplin");

        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject);

    }

    @Test(dependsOnMethods = "createJson" )
    public void readJson(){
        JSONObject jsonObject = new JSONObject(jsonString);
        String name = jsonObject.getString("Name");
        System.out.println(name);
    }

    @Test(dependsOnMethods = "createJsonArrayFromBean")
    public void readJsonUsingBean(){
        JSONArray array = new JSONArray(jsonArray);
        JSONObject jsonObject = array.getJSONObject(1);
        System.out.println(jsonObject.getString("name"));

    }


}
