package test.dataprovidertest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class DataProviderAndIterator {
    @DataProvider(name="DataProviderIterator")
    public Iterator<Object> studentDetails(){
        ArrayList<Object> s=new ArrayList<>();
        s.add(new Student("Kiran", 28, "Male"));
        s.add(new Student("Amod", 20, "Male"));
        s.add(new Student("Anu", 28, "Female"));
        return s.iterator();
    }

    // Test method accepting Student type attribute ( Not an Iterator)
    @Test(dataProvider = "DataProviderIterator")
    public void Studentregistration(Student student) {

        if(student.validateAge())
        {
            System.out.println("Student registered with details as Name = "+student.name + " , Age ="+student.age +" , Gender ="+student.gender);
        }
        else
        {
            System.out.println("Student not registered with details as Name = "+student.name + " , Age ="+student.age +" , Gender ="+student.gender);
        }

    }
}
