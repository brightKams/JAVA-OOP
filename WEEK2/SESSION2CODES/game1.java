import java.util.Scanner;

public class game1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get a random number using the "Math.random()" method
        double rand = Math.random();
        int rightGuess = (int) (rand * 6) + 1;
        // use a For loop to generate a particular number

        // for(int i = 0; i < count; i++){

        // System.out.println("Throw a dice..... from 1 to dice - rg = " + rightGuess +
        // " guess number = " + (i+1));
        // int guess = input.nextInt();

        // if(guess < 1 || guess > 6) {
        // System.out.println("You must throw a dice from 1 to 6");
        // i--;

        // }

        // if(guess == rightGuess) {
        // System.out.println("You Have won");
        // break;
        // }

        // };

        // RUNNING A WHILE LOOP

        // int count = 4;
        boolean continueGuessing = true;
        int counter = 0;

        while (continueGuessing) {

            System.out.println("Throw a dice..... from 1 to dice - rg = " + rightGuess + " guess number = " + counter);
            int guess = input.nextInt();
            
            if (guess < 1 || guess > 6) {
                System.out.println("You must throw a dice from 1 to 6");
                counter--;
            }
            
            if (guess == rightGuess) {
                System.out.println("You Have won");
                break;
            }
            
            if (counter > 3) {
                System.out.println("You have lost");
                continueGuessing = false;
                break;
                
            }
            counter++;
        }
        
        input.close();
    }

}
