package task1Car;

public class Car {

    private String brand;
    private int mileage;
    private int serviceOnMilage = 200_000;

    public Car() {
        brand = "Fiat";
        mileage = 30_000;
    }

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public void setModel(String model) {
        this.brand = model;
    }

    public String getModel() {
        return brand;
    }

    public void setDistance(int distance) {
        this.mileage = distance;
    }

    public int getDistance() {
        return mileage;
    }

    public void drive(int distance) {
        mileage += distance;
    }

    public int whenInspectionNeeded() {
        int k = 10_000;
        return (mileage / k)*k  + k;
    }
    public void showCar() {
        System.out.println("Car: brand- " + brand + " mileage: " + mileage);
    }

    public int howManyKmToService() {
        int kmToService = serviceOnMilage - mileage;
        return kmToService;
    }

    @Override
    public String toString() {
        return "Brand - " + brand + ", milage - " + mileage + ", to next service: " + howManyKmToService();
    }



}
