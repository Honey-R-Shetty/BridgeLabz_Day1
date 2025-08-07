package vehicle_toll_Management;

import java.util.Scanner;

public class TollManagementSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBooth booth = new TollBooth();
        int choice;

        do {
            System.out.println("\n--- Toll Management Menu ---");
            System.out.println("1. Add Bike");
            System.out.println("2. Add Car");
            System.out.println("3. Add Truck");
            System.out.println("4. Show All Vehicles");
            System.out.println("5. Show Total Toll");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            String plate;
            int stay;

            switch (choice) {
                case 1:
                    System.out.print("Enter Bike Plate Number: ");
                    plate = sc.nextLine();
                    System.out.print("Enter Stay Time: ");
                    stay = sc.nextInt();
                    booth.processVehicle(new Bike(plate, stay));
                    break;
                case 2:
                    System.out.print("Enter Car Plate Number: ");
                    plate = sc.nextLine();
                    System.out.print("Enter Stay Time: ");
                    stay = sc.nextInt();
                    booth.processVehicle(new Car(plate, stay));
                    break;
                case 3:
                    System.out.print("Enter Truck Plate Number: ");
                    plate = sc.nextLine();
                    System.out.print("Enter Stay Time: ");
                    stay = sc.nextInt();
                    booth.processVehicle(new Truck(plate, stay));
                    break;
                case 4:
                    booth.showAllVehicles();
                    break;
                case 5:
                    booth.showTotalToll();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(true);
	}       
}
