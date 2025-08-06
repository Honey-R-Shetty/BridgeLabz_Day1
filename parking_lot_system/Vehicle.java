package parking_lot_system;

abstract class Vehicle {
	int number;
	String owner;
	String type;
	
	public Vehicle(int number, String owner, String type) {
		super();
		this.number = number;
		this.owner = owner;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}
	public String getOwner() {
		return owner;
	}
	public String getType() {
		return type;
	}
	abstract int getCharge();
	
}
