import java.util.Scanner;

public class Lab2_3 {
    
    public static void main(String[] args) {
    

        //  WRITE A CODE TO ANALYSE EXAM RESULTS USING WHILE LOOP AND NESTED CONTROL STATEMENTS(2)

        Scanner input = new Scanner(System.in);
        int score, loopCount, passes, failures;
        score = 0;
        boolean loopControl = true;
        passes = 0;
        failures = 0;
        loopCount = 0;

        System.out.println(score);

        while(loopControl) {
            System.out.println("Enter a result(1- Pass, 2 = Fail, Other value to Exit):");
            score = input.nextInt();
            if(score == 1) {
                System.out.printf("\nResult is: %d\t", score);
                passes++;
                loopCount++;
                score++;
                System.out.printf("LoopCount is: %d\n", loopCount);
            } else if(score == 2) {
                System.out.printf("\nResult is:\t%d\t", score);
                failures++;
                loopCount++;
                score++;
                System.out.printf("LoopCount is: %d\n", loopCount);

            } else {
                System.out.println("Data entry is done:");
                System.out.println("LoopCount is: " + loopCount);
                System.out.printf("Total Scores are: \nPasses: %d\t Failures: %d\t\n", passes, failures);
                loopControl = false;
                double halfEntries = loopCount/2;
                System.out.println("Average result is: " + halfEntries);
                if(passes > halfEntries) {
                    System.out.println("Bonus to instructor: Half of the Students passed with: " + passes + " Passes");
                } else if(failures > halfEntries) {
                    System.out.println("Bonus to Instructor: Half of the students failed with: " + failures + " Failures.");
                } else{
                    System.out.println("We have Eqaul number of Student Passes and Failures");
                }
            }
            // if (loopCount == 7) {
            //     System.out.println("LoopCount is: " + loopCount);
            //     System.out.printf("Total Scores are: \tPasses: %d\t Failures: %d\t", passes, failures);
            //     loopControl = false;
            // }
        }
        input.close();
    }
}
