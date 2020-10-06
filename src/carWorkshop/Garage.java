package carWorkshop;

public class Garage {

    private static final int WHEEL_REPAIR_PRICE = 30;
    private static final int BEST_WHEEL_PRESSURE = 225;

    public void repair(Car car) {
        int wheelsRepaired = repairWheels(car.getWheels());
        printResult(wheelsRepaired);
    }

    public int repairWheels(Wheel[] wheels) {
        int wheelsRepaired = 0;
        for (Wheel wheel: wheels) {
            if(wheel.isPierced()) {
                wheelsRepaired++;
                wheel.repair(BEST_WHEEL_PRESSURE);
            }
        }
        return wheelsRepaired;
    }

    public void printResult(int wheelsRepaired) {
        System.out.println("Naprawiono: " + wheelsRepaired);
        System.out.println("Cena: " + wheelsRepaired*WHEEL_REPAIR_PRICE);
    }
}
