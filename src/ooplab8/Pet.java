package ooplab8;

public class Pet {
    private String name;
    private String harircolor;
    private String gender;
    private int age;

    public void makeNoise(){}

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", harircolor='" + harircolor + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Pet(String name, String harircolor, String gender, int age) {
        this.name = name;
        this.harircolor = harircolor;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getHarircolor() {
        return harircolor;
    }
    //getter and setter methor



}
