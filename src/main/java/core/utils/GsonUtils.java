package core.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public class GsonUtils {


   //Accepts json as a string and class name and map the class object to respective fields in json
    public static <T> T fromJsonToJavaObject(String json, Class<T> className){
        Gson gson = new Gson();
        return  gson.fromJson(json,className);
    }

    //Accepts a object and convert it to json string
    public static String toJsonFromJavaObject(Object obj){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(obj);
    }

}
