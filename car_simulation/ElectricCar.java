package car_simulation;

class ElectricCar extends Car {
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
        System.out.println("Distance: " + distance + " km, Battery: " + fuel );
    }
}