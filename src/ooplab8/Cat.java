package ooplab8;

public class Cat extends Pet {
    public Cat(String name, String harircolor, String gender, int age) {
        super(name, harircolor, gender, age);
    }

    @Override
    public void makeNoise() {
      System.out.println("Meaw Meaw !!!");
    }
}
