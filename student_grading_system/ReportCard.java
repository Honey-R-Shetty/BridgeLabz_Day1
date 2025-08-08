package student_grading_system;

public class ReportCard {

    public static void generate(Student student) {
        int total = 0;
        
        for (Subject s : student.subjects) {
            total += s.marks;
        }

        int avg = total / student.subjects.length;
        char grade;
        if (avg >= 90) 
        	grade = 'A';
        else if (avg >= 75) 
        	grade = 'B';
        else if (avg >= 60) 	
        	grade = 'C';
        else if (avg >= 40) 
        	grade = 'D';
        else 
        	grade = 'F';

        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + avg);
        System.out.println("Grade       : " + grade);
    }
}
