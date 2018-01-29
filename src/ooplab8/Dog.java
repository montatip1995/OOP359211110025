package ooplab8;
//Dog is sup-class
//Pet is super-class
public class Dog extends Pet{
    public Dog(String name, String harircolor, String gender, int age) {
        super(name, harircolor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}
