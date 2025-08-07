package vehicle_toll_Management;


class TollBooth {
    private Vehicle[] vehicles = new Vehicle[100];
    private int count = 0;
    private int totalToll = 0;

    public void processVehicle(Vehicle vehicle) {
    	System.out.println("----------------------------------");
        System.out.println("Vehicle Plate: " + vehicle.plateNumber());
        System.out.println("Toll Amount: " + vehicle.getTollAmount());
        System.out.println("Stay Time: " + vehicle.stayTime() + " minutes");
        System.out.println("----------------------------------");
        
        if (count < vehicles.length) {
            vehicles[count++] = vehicle;
        }

        totalToll += vehicle.getTollAmount();
    }
    public void showTotalToll() {
        System.out.println("Total Toll Collected: " + totalToll);
    }

    public void showAllVehicles() {
        if (count == 0) {
            System.out.println("No vehicles processed yet.");
            return;
        }

        for (int i = 0; i < count; i++) {
            Vehicle v = vehicles[i];
            System.out.println("Plate: " + v.plateNumber() + ", Toll: " + v.getTollAmount() + ", Stay: " + v.stayTime() + " mins");
        }
    }
}