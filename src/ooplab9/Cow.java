package ooplab9;

import ooplab8.Pet;

public class Cow extends Pet{
    public Cow(String name, String harircolor, String gender, int age) {
        super(name, harircolor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Mor Mor !!!");
    }

}//class
