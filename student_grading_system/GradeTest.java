package student_grading_system;

public class GradeTest {
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
