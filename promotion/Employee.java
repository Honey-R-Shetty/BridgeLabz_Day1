package promotion;

public class Employee {
    private int id;
    private String name;
    private String level;
    private double salary;

    public Employee(int id, String name, String level, double salary) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void promote() {
        String next = Level.getNextLevel(level);
        if (next != null) {
            double increment = Level.getIncrement(next);
            salary += increment;
            level = next;
            System.out.println(name + " promoted to " + level + " with new salary: " + salary);
        } else {
            System.out.println(name + " is already at the highest level (" + level + ").");
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Level: " + level + ", Salary: " + salary);
    }
}
