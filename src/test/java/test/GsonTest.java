package test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.Test;
import pojo.responsepojo.NamePojo;

import javax.naming.Name;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GsonTest {
    String stringJson;
    String stringArray;
    @Test
    public void createJson(){
        Gson gson = new Gson();
        NamePojo namePojo = new NamePojo();
        namePojo.setName("David");
        namePojo.setLastName("Beckam");
         stringJson = gson.toJson(namePojo);
        System.out.println(stringJson);
    }

    @Test
    public void createJsonArray(){
        Gson gson = new Gson();
        NamePojo namePojo = new NamePojo();
        namePojo.setName("David");
        namePojo.setLastName("Beckam");

        NamePojo namePojo1 = new NamePojo();
        namePojo1.setName("Mahesh");
        namePojo1.setLastName("Bhupati");

        List<NamePojo> list = new ArrayList<>();
        list.add(namePojo);
        list.add(namePojo1);
        stringArray = gson.toJson(list);
        System.out.println(stringArray);
    }

    @Test(dependsOnMethods = "createJson")
    public void readJson(){
        Gson gson = new Gson();
        NamePojo namePojo = gson.fromJson(stringJson,NamePojo.class);
        System.out.println(namePojo.getName());
        System.out.println(namePojo.getLastName());
        System.out.println("**********************");
    }

    @Test(dependsOnMethods = "createJsonArray")
    public void readJsonArray(){
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<NamePojo>>(){}.getType();
        ArrayList<NamePojo> namePojo =  gson.fromJson(stringArray,listType);
        System.out.println(namePojo.get(0).getName());
        System.out.println(namePojo.get(0).getLastName());
        System.out.println("********###***********");
    }
}
