package test.dataprovidertest;

public class Student {
    String name;
    String lastName;
    int age;
    String gender;
    String state;
    String height;
    int weight;
    String nationality;
    String race;
    String language;

    public Student(String name, String lastName, int age, String gender, String state, String height, int weight, String nationality, String race, String language) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.state = state;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
        this.race = race;
        this.language = language;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", state='" + state + '\'' +
                ", height='" + height + '\'' +
                ", weight=" + weight +
                ", nationality='" + nationality + '\'' +
                ", race='" + race + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

  //   A method to check if student is eligible for registration
    public boolean validateAge()
    {
        if(this.age>=28)
        {
            System.out.println("You are eligible to do registration.");
            return true;
        }
		else
        return false;
    }

}
