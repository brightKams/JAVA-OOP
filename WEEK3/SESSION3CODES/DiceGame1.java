public class DiceGame1 {

    public static void diceFunc() {
        double guess_1, guess_2;
        boolean continue_throwing;

        int tries = 0;
        continue_throwing = true;
        while (continue_throwing) {
            guess_1 = 1 + (Math.random() * 6);
            guess_2 = 1 + Math.random() * 6;
            int guess1 = (int) guess_1;
            int guess2 = (int) guess_2;
            int dice_sum = guess1 + guess2;
            System.out.println("first Guess is: " + guess1 + "\n" + "Second Guess is: " + guess2
                    + "\nYour total Guess is: " + dice_sum + "\n");
            tries++;

            if (dice_sum == 12) {

                // System.out.println(tries + " trial");
                System.out.printf("You won at Trial %d", tries);
                continue_throwing = false;

            } else if (tries < 2 && dice_sum != 12) {
                System.out.println("Try again for the last time");
            }

            else if (tries == 2 && dice_sum != 12) {
                System.out.println("Sorry you failed Start the Game again!!!");
                continue_throwing = false;
            }

        }

    }

    public static void main(String[] args) {
        diceFunc();
    }

}
