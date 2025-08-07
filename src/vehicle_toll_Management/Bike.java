package vehicle_toll_Management;

public class Bike implements Vehicle {
	String plateNumber;
	int stayTime;
	
	public Bike(String plateNumber,int stayTime) {
		this.plateNumber=plateNumber;
		this.stayTime=stayTime;
	}
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getStayTime() {
		return stayTime;
	}

	public void setStayTime(int stayTime) {
		this.stayTime = stayTime;
	}

	@Override
	public int getTollAmount() {
		return 100;
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
