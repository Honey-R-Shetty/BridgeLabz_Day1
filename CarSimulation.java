public class CarSimulation {

    static class Car {
        protected int speed;         
        protected double fuel;       
        protected double distance; 

        public Car(int speed, double fuel) {
            this.speed = speed;
            this.fuel = fuel;
            this.distance = 0;
        }

        public void drive(int hours) {
            double maxDistance = speed * hours;
            double fuelNeeded = maxDistance / 10; 

            if (fuel >= fuelNeeded) {
                distance += maxDistance;
                fuel -= fuelNeeded;
                System.out.println("Car drove " + maxDistance + " km.");
            } else {
                double actualDistance = fuel * 10;
                distance += actualDistance;
                fuel = 0;
                System.out.println("Car ran out of fuel after " + actualDistance + " km.");
            }
        }

        public void showStatus() {
            System.out.println("Distance: " + distance + " km, Fuel: " + fuel + " L");
        }
    }

    static class ElectricCar extends Car {
        public ElectricCar(int speed, double batteryPercent) {
            super(speed, batteryPercent); 
        }

        @Override
        public void drive(int hours) {
            double maxDistance = speed * hours;
            double batteryNeeded = maxDistance / 2; 

            if (fuel >= batteryNeeded) {
                distance += maxDistance;
                fuel -= batteryNeeded;
                System.out.println("Electric car drove " + maxDistance + " km.");
            } else {
                double actualDistance = fuel * 2;
                distance += actualDistance;
                fuel = 0;
                System.out.println("Battery depleted after " + actualDistance + " km.");
            }
        }

        @Override
        public void showStatus() {
            System.out.println("Distance: " + distance + " km, Battery: " + fuel + " %");
        }
    }

    public static void main(String[] args) {
        Car petrolCar = new Car(60, 10);
        Car tesla = new ElectricCar(80, 100);

        System.out.println("--- Petrol Car ---");
        petrolCar.drive(2); 
        petrolCar.showStatus();

        System.out.println("\n--- Electric Car ---");
        tesla.drive(1); 
        tesla.showStatus();
    }
}
