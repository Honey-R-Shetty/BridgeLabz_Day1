package car_simulation;

public class CarSimulation {
    public static void main(String[] args) {
        Car petrolCar = new Car(60, 10);
        Car Honda = new ElectricCar(80, 100);

        System.out.println("--- Petrol Car ---");
        petrolCar.drive(2); 
        petrolCar.showStatus();

        System.out.println("--- Electric Car ---");
        Honda.drive(1); 
        Honda.showStatus();
    }
}
