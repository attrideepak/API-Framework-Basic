package test.dataprovidertest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DataProviderAndIterator {

    @DataProvider(name="DataProviderIteratorBuilder")
    public Iterator<Object[]> studentDetailsBuilder(){
        List<Object[]> s=new ArrayList<>();
        CreateStudent s1 = new CreateStudent.StudentBuilder().setName("Elon")
                .setLastName("Musk")
                .setAge(40)
                .build();
        s.add(new Object[]{s1});
        return s.iterator();
    }

    @DataProvider(name = "student")
    public Object[][] student(){
        Student s1 = new Student();
        s1.setName("Ramu");
        s1.setLastName("Sharma");
        s1.setAge(35);
        s1.setGender("male");
        s1.setHeight("5.9");
        s1.setWeight(75);
        s1.setNationality("Indian");
        s1.setRace("Aryan");
        s1.setLanguage("Hindi");

        Student s2 = new Student();
        s2.setName("Punk");
        s2.setLastName("Sharma");
        s2.setAge(35);
        s2.setGender("male");

        return new Object[][]{{s1},{s2}};
    }

    @DataProvider(name="DataProviderIteratorSetter")
    public Iterator<Object[]> studentDetailsSetter(){
        List<Object[]> s=new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Pankaj");
        s1.setLastName("Sharma");
        s1.setAge(35);
        s1.setGender("male");
        s1.setHeight("5.9");
        s1.setWeight(75);
        s1.setNationality("Indian");
        s1.setRace("Aryan");
        s1.setLanguage("Hindi");

        Student s2 = new Student();
        s2.setName("Punk");
        s2.setLastName("Sharma");
        s2.setAge(35);
        s2.setGender("male");

        s.add(new Object[]{s1});
        s.add(new Object[]{s2});


        return s.iterator();
    }

    @DataProvider(name="DataProviderIteratorConstructor")
    public Iterator<Object[]> studentDetails(){
        List<Object[]> s=new ArrayList<>();
        s.add(new Object[]{
                new Student("Rahul","Sharma",25,"male","Haryana","5.9",75,"Indian","Aryan","Hindi"),
        });

        s.add(new Object[]{
                new Student("Ram","Sharma",50,"male","Haryana","5.9",75,"Indian","Aryan","Hindi"),
        });

        return s.iterator();
    }



    // Test method accepting Student type attribute ( Not an Iterator)
    @Test(dataProvider = "DataProviderIteratorConstructor")
    public void Studentregistration(Student student) {

        if(student.validateAge())
        {
            System.out.println("Student registered with details as Name = "+student.name + " , Age ="+student.age +" , Gender ="+student.getGender());
        }
        else
        {
            System.out.println("Student not registered with details as Name = "+student.name + " , Age ="+student.age +" , Gender ="+student.getGender());
        }

    }

    @Test(dataProvider = "DataProviderIteratorConstructor")
    public void StudentDetails(Student student) {
        System.out.println(student.toString());
        System.out.println("Student registered with details as Name = "+student.name+ " , Age ="+student.age +" , Gender ="+student.gender);
    }

    @Test(dataProvider = "DataProviderIteratorSetter")
    public void StudentDetailsUsingSetters(Student student) {
        System.out.println(student.toString());
        System.out.println("Student registered with details as Name = "+student.getName()+ " , Age ="+student.getAge() +" , Gender ="+student.getGender());
    }

    @Test(dataProvider = "DataProviderIteratorBuilder")
    public void StudentDetailsUsingBuilder(CreateStudent student) {
        System.out.println(student.toString());
        System.out.println("Student registered with details as Name = "+student.getName()+ " , Age ="+student.getAge() +" , Gender ="+student.getGender());
    }

    @Test(dataProvider = "student")
    public void Student(Student student) {
        System.out.println(student.toString());
        System.out.println("Student registered with details as Name = "+student.getName()+ " , Age ="+student.getAge() +" , Gender ="+student.getGender());
    }
}
