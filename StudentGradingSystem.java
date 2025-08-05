public class StudentGradingSystem{

    static class Subject {
        String name;
        int marks;

        public Subject(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    static class Student {
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
                System.out.println("- " + s.name + ": " + s.marks);
            }
        }
    }

    static class ReportCard {

        public static void generate(Student student) {
            int total = 0;
            for (Subject s : student.subjects) {
                total += s.marks;
            }

            int avg = total / student.subjects.length;
            char grade;

            if (avg >= 90) grade = 'A';
            else if (avg >= 75) grade = 'B';
            else if (avg >= 60) grade = 'C';
            else if (avg >= 40) grade = 'D';
            else grade = 'F';

            System.out.println("Total Marks : " + total);
            System.out.println("Average     : " + avg);
            System.out.println("Grade       : " + grade);
        }
    }

    public static void main(String[] args) {
        Subject[] subs = {
            new Subject("Math", 85),
            new Subject("Science", 92),
            new Subject("English", 78)
        };

        Student s = new Student("Riya", 101, subs);

        s.displayDetails();
        System.out.println("\n--- Report Card ---");
        ReportCard.generate(s);
    }
}
