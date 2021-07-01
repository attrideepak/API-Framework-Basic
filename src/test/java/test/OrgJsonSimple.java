package test;

//Library provided by google

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrgJsonSimple {

    String jsonString;
    String arrayJson;
    @Test
    public void createJsonFromObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Deepak");
        jsonObject.put("Last Name","Attri");
        jsonString = jsonObject.toJSONString();
        System.out.println(jsonObject);
    }

    @Test
    public void createJsonArrayFromObject(){
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Deepak");
        jsonObject.put("Last Name","Attri");

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("Name","Mike");
        jsonObject1.put("Last Name","Tyson");

        jsonArray.add(jsonObject);
        jsonArray.add(jsonObject1);

        System.out.println(jsonArray);
        arrayJson = jsonArray.toJSONString();
    }

    @Test
    public void createJsonObjectFromMap(){
        Map<String,String>map = new HashMap<>();
        map.put("Name","Charlie");
        map.put("Last Name","Chaplin");
        JSONObject jsonObject = new JSONObject();
        jsonObject.putAll(map);
        System.out.println(jsonObject);
    }

    @Test(dependsOnMethods = "createJsonFromObject")
    public void readJson() throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject  jsonObject = (JSONObject) jsonParser.parse(jsonString);
        System.out.println(jsonObject.get("Name"));
    }

    @Test(dependsOnMethods = "createJsonArrayFromObject")
    public void readJsonArray() throws ParseException, IOException {
        JSONParser jsonParser = new JSONParser();
        JSONArray  arr = (JSONArray) jsonParser.parse(arrayJson);
        JSONObject obj = (JSONObject) arr.get(1);
        System.out.println(obj.get("Name"));
    }
}
