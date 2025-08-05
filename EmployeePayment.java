abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + calculateSalary());
    }
}
class FullTime extends Employee {
    double monthlySalary;

    public FullTime(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTime extends Employee {
    int hoursWorked;
    double ratePerHour;

    public PartTime(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

class Contractor extends Employee {
    int daysWorked;
    double ratePerDay;

    public Contractor(String name, int id, int daysWorked, double ratePerDay) {
        super(name, id);
        this.daysWorked = daysWorked;
        this.ratePerDay = ratePerDay;
    }

    @Override
    double calculateSalary() {
        return daysWorked * ratePerDay;
    }
}

public class EmployeePayment {
    public static void main(String[] args) {
        Employee e1 = new FullTime("Alice", 101, 50000);
        Employee e2 = new PartTime("Bob", 102, 80, 200);
        Employee e3 = new Contractor("Charlie", 103, 20, 1500);

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}
