package Codsoft;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scan.nextInt();
        
        double totalMarks = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            double marks = scan.nextDouble();
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                return;
            }
            
            totalMarks += marks;
        }

        double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);

        scan.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
