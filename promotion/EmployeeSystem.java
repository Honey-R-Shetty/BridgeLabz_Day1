package promotion;

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(101, "Alice", "Junior", 30000);
        employees[1] = new Employee(102, "Bob", "Mid", 40000);
        employees[2] = new Employee(103, "Charlie", "Senior", 50000);
        employees[3] = new Employee(104, "Daisy", "Lead", 60000);
        employees[4] = new Employee(105, "Eve", "Junior", 30000);

        System.out.println("---- Employee Details Before Promotion ----");
        for (Employee e : employees) {
            e.display();
        }

        System.out.println("\n---- Promoting All Employees ----");
        for (Employee e : employees) {
            e.promote();
        }

        System.out.println("\n---- Employee Details After Promotion ----");
        for (Employee e : employees) {
            e.display();
        }
    }
}
