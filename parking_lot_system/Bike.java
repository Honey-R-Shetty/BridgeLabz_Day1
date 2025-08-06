package parking_lot_system;

public class Bike extends Vehicle {

	public Bike(int number, String owner) {
		super(number, owner, "Bike");
	}

	@Override
	int getCharge() {
		return 100;
	}
}
