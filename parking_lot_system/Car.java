package parking_lot_system;

public class Car extends Vehicle{

	public Car(int number, String owner) {
		super(number, owner, "Car");
	}

	@Override
	int getCharge() {
		return 300;
	}
}
