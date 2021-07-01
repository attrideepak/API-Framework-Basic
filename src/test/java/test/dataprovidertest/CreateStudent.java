package test.dataprovidertest;

public class CreateStudent {
    private String name;
    private String lastName;
    private int age;
    private String gender;
    private String state;
    private String height;
    private int weight;
    private String nationality;
    private String race;
    private String language;


    public CreateStudent(StudentBuilder studentBuilder){
        this.name = studentBuilder.name;
        this.lastName = studentBuilder.lastName;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
        this.state = studentBuilder.state;
        this.height = studentBuilder.height;
        this.weight = studentBuilder.weight;
        this.nationality = studentBuilder.nationality;
        this.race = studentBuilder.race;
        this.language = studentBuilder.language;

    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getState() {
        return state;
    }

    public String getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getNationality() {
        return nationality;
    }

    public String getRace() {
        return race;
    }

    public String getLanguage() {
        return language;
    }

    static class StudentBuilder{
        private String name;
        private String lastName;
        private int age;
        private String gender;
        private String state;
        private String height;
        private int weight;
        private String nationality;
        private String race;
        private String language;

        public StudentBuilder setName(String name) {
            this.name = name;
           return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public StudentBuilder setHeight(String height) {
            this.height = height;
            return this;
        }

        public StudentBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public StudentBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public StudentBuilder setRace(String race) {
            this.race = race;
            return this;
        }

        public StudentBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public CreateStudent build(){
            CreateStudent student = new CreateStudent(this);
            return student;
        }
    }

    @Override
    public String toString() {
        return "CreateStudent {" +
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
}
