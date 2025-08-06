package promotion;

public class Employee {
    private int id;
    private String name;
    private Level level;
    private double salary;

    public Employee(int id, String name, Level level, double salary) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void promote() {
        Level next = level.getNextLevel();
        if (next != null) {
            salary += next.getIncrement();
            level = next;
            System.out.println(name + " promoted to " + level + " with new salary: " + salary);
        } else {
            System.out.println(name + " is already at the highest level (LEAD).");
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Level: " + level + ", Salary: " + salary);
    }
}
