package parking_lot_system;

public class Parking_Lot {
	int slots = 10;
	int revenue = 0;
	int availableSlots = slots;
	Vehicle[] slot = new Vehicle[slots];

	void parking(Vehicle v) {
		if (availableSlots != 0) {
			for (int i = 0; i < slots; i++) {
				if (slot[i] == null) {
					slot[i] = v;
					revenue += v.getCharge();
					System.out.println("Your " + v.getType() + " is parked in slot number " + (i + 1));
					availableSlots--;
					return;
				}
			}
		} else {
			System.out.println("Slots are full....");
		}
	}

	void remove(int index) {
		int i = index - 1;
		if (slot[i] != null) {
			slot[i] = null;
			System.out.println("Slot "+i+" available...");
		} else {
			System.out.println("Slot already available...");
		}
	}

	void ParkedVehicles() {
		System.out.println("\nParked Vehicle Details:");
		for (int i = 0; i < slots; i++) {
			if (slot[i] != null) {
				Vehicle v = slot[i];
				System.out.println("Slot -->" + (i + 1) + " ,Type:  " + v.getType() + " ,Vehicle type: " + v.getNumber()
						+ " ,Owner: " + v.getOwner());
			}
		}
	}

	int totalRevenue() {
		return revenue;
	}

}
