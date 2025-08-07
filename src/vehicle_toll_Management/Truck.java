package vehicle_toll_Management;

public class Truck implements Vehicle{
	String plateNumber;
	int stayTime;
	
	public Truck(String plateNumber,int stayTime) {
		this.plateNumber=plateNumber;
		this.stayTime=stayTime;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}

	public int getStayTime() {
		return stayTime;
	}

	@Override
	public int getTollAmount() {
		return 1000;
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
