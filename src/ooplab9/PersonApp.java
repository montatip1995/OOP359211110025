package ooplab9;

public class PersonApp {
    person person = new person("Montatip Yodsawai","1111111111111",
            new Address ("272 M.12","NakonSriThammarat","80230"),
            new Job("Student","7000"));

        System.out.println(person.toString());
        person.getJob().setSalary("30000");
        System.out.println(person.getJob());
}//class
