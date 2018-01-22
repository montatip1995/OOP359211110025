package ooplab7;

import java.util.Scanner;

public class mySuperCar {

    public static void main(String[] args) {
        SuperCar car =new SuperCar();
        car=inputData(car);

    }//main
    private static SuperCar inputData(SuperCar car) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Supercar info : ");
        System.out.print("Enter CarBrand : ");
        car.setCarbrand(scanner.nextLine());
        System.out.print("Enter CarColor : ");
        car.setCarcolor(scanner.nextLine());
        System.out.print("Enter CarEnginesize : ");
        car.setCarengsize(scanner.nextLine());
        System.out.print("Enter CarMaxspeed : ");
        car.setCarmaxspeed(scanner.nextLine());
        System.out.print("Enter CountryofOrigin : ");
        car.setCarcounofori(scanner.nextLine());
        return car;
    }
}//class
