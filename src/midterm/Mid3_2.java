package midterm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mid3_2 {
    static BufferedReader input = new BufferedReader
            (new InputStreamReader(System.in));
    static Scanner number = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String id = getID();
        String name = getName();
        float pay = getSalary();
        float ot = getOverTime();
        showDataInfo(id, name, pay, ot);
    }//main

    private static void showDataInfo(String id, String name, float pay, float ot) {
        System.out.println("--------------------------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + pay + " Baht");
        System.out.println("OverTime : " + ot + " Baht");
        System.out.println("Taxable :" + incomeAndTaxes(pay, ot)+" %");
    }//showDataInfo

    private static String getID() throws IOException {
        System.out.print("Enter your ID: ");
        String id = input.readLine();
        return id;
    }//getID

    public static String getName() throws IOException {
        System.out.print("Enter your name: ");
        String name = input.readLine();
        return name;
    }//getName

    public static float getSalary() {
        System.out.print("Enter your Salary: ");
        float salary = number.nextFloat();
        return salary;
    }//getSalary

    public static float getOverTime() {
        System.out.print("Enter your Over Time: ");
        float overTime = number.nextFloat();
        return overTime;
    }//getOverTime

    private static int incomeAndTaxes(float i, float m) {
        float income = m + i;
        System.out.println("Income : " + income + " Baht");
        if (income >= 100000) {
            return 10;
        } else if (income >= 70000) {
            return 7;
        } else if (income >= 50000) {
            return 5;
        } else if (income >= 30000) {
            return 3;
        } else {
            return 1;
        }
    }//incomeAndTaxes
}//class