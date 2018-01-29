package ooplab8;
//Application for Pet,Dog, and Cat Class
public class PatApp {
    public static void main(String[] args) {
        Dog dog=new Dog("Bow","whigth",
                "Female",2);

        System.out.println(dog.toString());

        Cat cat=new Cat("Samock","gray"
                ,"Female",3);

        System.out.println(cat.getClass()+cat.toString());
        dog.makeNoise();
        cat.makeNoise();


    }//main
}//class
