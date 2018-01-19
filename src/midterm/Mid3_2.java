package midterm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mid3_2 {
    static BufferedReader input=new BufferedReader
            (new InputStreamReader(System.in));
    static Scanner ot =new Scanner(System.in);
    static Scanner pay=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        getID(input);
        getName(input);
        getSalary(pay);
        getOverTime(ot);
        showDataInfo();
    }//main

    public static void showDataInfo() throws IOException {

        System.out.println("--------------------------");
        System.out.println("ID:" +getID(input));
        System.out.println("Name:" + getName(input));
        System.out.println("Salary:" +getSalary(pay)+" Baht");
        System.out.println("OverTime:" +getOverTime(ot)+" Baht");

    }
    private static String getID(BufferedReader input)
            throws IOException {
        System.out.print("Enter your ID: ");
        String id =input.readLine();
        return id;
    }//getID

    private static String getName(BufferedReader input)
            throws IOException {
        System.out.print("Enter your name: ");
        String name =input.readLine();
        return name;
    }//getName

    private static int getOverTime(Scanner ot)
            throws IOException{
        System.out.print("Enter your OverTime: ");
        int overtime = ot.nextInt();
        return overtime;
    }//getOverTime

    private static int getSalary(Scanner pay)
            throws IOException{
        System.out.print("Enter your Salary: ");
          int salary = pay.nextInt();
        return salary;
    }//OverTime
}//class
