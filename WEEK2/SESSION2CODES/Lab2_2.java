import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int passes, failures, scores, loopCount;
        // int passes;
        // int failures;
        // int scores;
        // int floopCount;
        // int scores, loopCount;

        // System.out.println("Enter a score: ");
        passes = 0;
        // System.out.println("Enter a score: ");
        failures = 0;
        boolean loopControl = true;
        loopCount = 0;

        while (loopControl) {
            System.out.println("Enter result(1 - Pass, 2 = fail, Other value to Exit): ");
            scores = input.nextInt();
            if (scores == 1) {
                passes++;
              
                System.out.println("Passed Score is: " + passes);
                // System.out.println(scores+" \n");
                // loopCount++;
                // if(loopCount == 7) {

                // System.out.println("\nYour Score is: " + passes);
                // System.out.println("\nHurray You Passed!!!");
                // }

            } else if (scores == 2) {
                failures++;
                System.out.println("Failed Score is " + failures);
                // System.out.println(scores + " \n");
                // loopCount++;
                // if(loopCount == 7) {
                // System.out.println("\nYour Score is " + failures);
                // System.out.println("\nSorry, You Failed; Please Try again");
                // }
            } else {
                loopControl = false;
                System.out.println(scores + " - is wrong; Therefore, " + "Entry has ended: \n");
                System.out.printf("Total number of Passes and failures are: %d and %d respectively.\n", passes,
                        failures);
            }

            loopCount++;
            if (loopCount == 7) {
                System.out.printf(
                        "loopCount: %d\n" + "Total number of Passes and failures are: %d and %d respectively.\n",
                        loopCount, passes, failures);

                loopControl = false;
            }

        }
        input.close();
    }

}
