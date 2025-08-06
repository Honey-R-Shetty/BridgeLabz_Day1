package promotion;

import java.util.Scanner;

public class EmployeeSystem {
    private Employee[] employees = new Employee[5];
    private int count = 0;

    public void addEmployee(int id, String name, Level level, double salary) {
        if (count < 5) {
            employees[count++] = new Employee(id, name, level, salary);
            System.out.println("Employee added successfully.\n");
        } else {
            System.out.println("Cannot add more employees. Limit reached.\n");
        }
    }

    public void promoteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                employees[i].promote();
                return;
            }
        }
        System.out.println("Employee not found.\n");
    }

    public void showAllEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeSystem system = new EmployeeSystem();

        while (true) {
            System.out.println("\n--- EMPLOYEE PROMOTION SYSTEM ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Promote Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Level (JUNIOR/MID/SENIOR/LEAD): ");
                    String levelStr = sc.next().toUpperCase();
                    Level level = Level.valueOf(levelStr);
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    system.addEmployee(id, name, level, sal);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to promote: ");
                    int pid = sc.nextInt();
                    system.promoteEmployee(pid);
                    break;

                case 3:
                    system.showAllEmployees();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
  