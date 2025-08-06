package parking_lot_system;

public class Main {
	public static void main(String[] args) {
        Parking_Lot lot = new Parking_Lot();

        Vehicle v1 = new Bike(101, "Honey");
        Vehicle v2 = new Car(102, "Riddhi");
        Vehicle v3 = new Truck(103, "Nishchitha");

        lot.parking(v1);
        lot.parking(v2);
        lot.parking(v3);
        lot.parking(v1);
        
        lot.remove(3);
        lot.parking(v3);
        lot.ParkedVehicles();
        System.out.println("Total Revenue: " + lot.totalRevenue());
    }
}
