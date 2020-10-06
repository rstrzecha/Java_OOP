package task1Car;

import java.util.Scanner;

public class CarService {

    public Car createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj markę: ");
        String brand = scanner.nextLine();
        System.out.print("Podaj przebieg: ");
        int milage = scanner.nextInt();
        Car car = new Car(brand,milage);
        return car;
    }

    public void toService(Car car) {
        int toService = car.howManyKmToService();
        if (toService > 0) {
            System.out.println("Distance to service: " + toService);
        } else {
            System.out.println("Service should have been done: " + -toService + "km before");
        }
    }




}
