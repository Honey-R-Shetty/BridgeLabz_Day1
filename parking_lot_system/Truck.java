package parking_lot_system;

public class Truck extends Vehicle {

	public Truck(int number, String owner) {
		super(number, owner, "Truck");
	}

	@Override
	int getCharge() {
		return 500;
	}
	
}
