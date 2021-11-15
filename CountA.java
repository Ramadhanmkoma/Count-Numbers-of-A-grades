import java.util.Scanner;

public class StuedntGrades {
    
    public static void main(String[] args) {
        
        int marks, no_of_students, count;
        String grades;
        count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Students: ");
        no_of_students = input.nextInt();

        for (int i = 1; i <= no_of_students; i++) {
            System.out.println("Enter number of marks of student " + i + ": ");
            marks = input.nextInt();

            if (marks >= 90 && marks <= 100) {
                grades = "A";
                count++;
                System.out.println("Student " + i + " got " + grades);
            }else if (marks >= 80) {
                grades = "B";
                System.out.println("Student " + i + " got " + grades);
            }else if (marks >= 60) {
                grades = "C";
                System.out.println("Student " + i + " got " + grades);
            }else if (marks >= 50 ) {
                grades = "D";
                System.out.println("Student " + i + " got " + grades);
            }else {
                grades = "FAILED";
                System.out.println("Student " + i + " got " + grades);
            }

        }

        System.out.println(count + " Students Got an A grade.");

    }
}
