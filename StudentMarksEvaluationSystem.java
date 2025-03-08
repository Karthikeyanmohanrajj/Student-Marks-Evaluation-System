import java.util.Scanner;

public class StudentMarksEvaluationSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Array of subject names
        String[] subjects = {"Math", "Science", "English", "History", "Geography"};
        
        int totalMarks = 0;
        int passedSubjects = 0;
        final int PASS_MARK = 35;
        
        // Loop to get marks for 5 subjects
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter the mark for " + subjects[i] + ": ");
            int mark = scan.nextInt();
            totalMarks += mark;

            // Check pass or fail
            if (mark < PASS_MARK) {
                System.out.println("You failed in " + subjects[i]);
            } else {
                System.out.println("You passed in " + subjects[i]);
                passedSubjects++;
            }
        }

        // Display total marks
        System.out.println("Your total marks: " + totalMarks);

        // Checking overall result
        if (passedSubjects == subjects.length) {
            System.out.println("Congratulations! You passed all subjects. Keep it up!");
        } else {
            System.out.println("You passed " + passedSubjects + " subjects. Keep trying!");
        }

        // Calculate average marks
        int average = totalMarks / subjects.length;

        // Grading system with corrected logic
        if (average >= 90) {
            System.out.println("Grade: O (Outstanding)");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else if (average >= 35) {
            System.out.println("Grade: E");
        } else {
            System.out.println("You failed this exam, No grade awarded.");
        }

        // Closing scanner
        scan.close();
    }
}
