package vehicle_toll_Management;

public class Car implements Vehicle {
	String plateNumber;
	int stayTime;

	public Car(String plateNumber, int stayTime) {
		this.plateNumber = plateNumber;
		this.stayTime = stayTime;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public int getStayTime() {
		return stayTime;
	}

	@Override
	public int getTollAmount() {
		return 500;
	}

	@Override
	public String plateNumber() {
		return this.plateNumber;
	}

	@Override
	public int stayTime() {
		return this.stayTime;
	}

}
