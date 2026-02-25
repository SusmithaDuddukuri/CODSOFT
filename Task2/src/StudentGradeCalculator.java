import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to calculate grade
    public static char calculateGrade(double average) {
        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else if (average >= 50)
            return 'E';
        else
            return 'F';
    }

    // Method to give remarks
    public static String getRemark(char grade) {
        switch (grade) {
            case 'A':
                return "Excellent Performance";
            case 'B':
                return "Very Good";
            case 'C':
                return "Good";
            case 'D':
                return "Needs Improvement";
            case 'E':
                return "Work Harder";
            default:
                return "Fail - Must Improve";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char retry;

        System.out.println("===== Student Grade Calculator =====");

        do {

            System.out.print("\nEnter number of subjects: ");
            int subjects = sc.nextInt();

            int totalMarks = 0;

            // Input marks
            for (int i = 1; i <= subjects; i++) {

                System.out.print("Enter marks for subject " + i + " (0-100): ");
                int marks = sc.nextInt();

                // Validation
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Enter between 0 and 100.");
                    i--; // repeat same subject
                    continue;
                }

                totalMarks += marks;
            }

            // Calculations
            double average = (double) totalMarks / subjects;
            char grade = calculateGrade(average);
            String remark = getRemark(grade);

            // Display result
            System.out.println("\n========== RESULT ==========");
            System.out.println("Total Marks        : " + totalMarks);
            System.out.printf("Average Percentage : %.2f%%\n", average);
            System.out.println("Grade              : " + grade);
            System.out.println("Remark             : " + remark);
            System.out.println("============================");

            // Retry option
            System.out.print("\nDo you want to calculate again? (Y/N): ");
            retry = sc.next().charAt(0);

        } while (retry == 'Y' || retry == 'y');

        System.out.println("\nThank you for using Student Grade Calculator!");
        sc.close();
    }
}