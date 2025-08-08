package student_grading_system;

public class Student {
    String name;
    int roll;
    Subject[] subjects;

    public Student(String name, int roll, Subject[] subjects) {
        this.name = name;
        this.roll = roll;
        this.subjects = subjects;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Subjects and Marks:");
        for (Subject s : subjects) {
            System.out.println( s.getName() + ": " + s.getMarks());
        }
    }
}



