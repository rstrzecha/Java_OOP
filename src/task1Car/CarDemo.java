package task1Car;

import oop.simpleExample.Person;

import java.util.Arrays;
import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {

        Scanner scanKeyb = new Scanner(System.in);

        Car fiat = new Car("Fiat 126", 310_000);
        Car ford = new Car("Ford S-Max", 11_000);
        ford.whenInspectionNeeded();

        fiat.drive(100);
        fiat.showCar();

        System.out.println(ford.howManyKmToService());
        System.out.println("Inspection needed at mileage: " + ford.whenInspectionNeeded());

        System.out.println(fiat.toString());

        /*Car car3 = new Car();
        System.out.println(car3.toString());

        System.out.print("Set new brand to add: ");
        String newBrand = scanKeyb.nextLine();
        System.out.print("Set its mileage: ");
        int newMilage = scanKeyb.nextInt();
        scanKeyb.close();

        Car newCar = new Car(newBrand, newMilage);

        int toService = newCar.howManyKmToService();
        if(toService > 0) {
            System.out.println("Distance to service: " + toService);
        } else {
            System.out.println("Service should have been done: " + -toService + "km before");
        }*/


        System.out.println("-----------------------------------------------------");
        CarService carService = new CarService();
        Car newCar = carService.createCar();
        System.out.println("Powstaje: " + newCar);
        System.out.println("Info nt przeglądu: " );
        carService.toService(newCar);

        System.out.println("-------------------ZADANIE 5----------------------------------");


        Car newCar1 = carService.createCar();
        Car newCar2 = carService.createCar();
        Car newCar3 = carService.createCar();
        Car newCar4 = carService.createCar();


        Car[] cars = new Car[4];






    }

}
