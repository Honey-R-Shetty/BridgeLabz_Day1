package car_simulation;

class Car {
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
