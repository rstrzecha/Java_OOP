package carWorkshop;

public class WarsztatDemo {
    public static void main(String[] args){
        Car car = new Car();
        Garage garage = new Garage();

        System.out.println(car);

        car.pierceRandomWheel();
        car.pierceRandomWheel();
        System.out.println(car);

        garage.repair(car);
        System.out.println(car);
    }
}
