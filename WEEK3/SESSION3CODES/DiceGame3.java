public class DiceGame3 {

    private static int generateRandom() {
        double guess_1, guess_2;
        int guess1, guess2, dice_sum;

        guess_1 = 1 + Math.random() * 6;
        guess_2 = 1 + Math.random() * 6;

        guess1 = (int) guess_1;
        guess2 = (int) guess_2;
        dice_sum = guess1 + guess2;
        System.out.println(guess1 + " && " + guess2);
        System.out.printf("your dice is %d\n", dice_sum);
        return dice_sum;
    }

    public static void diceResult() {
        int tries, remaining_tries, total_tries, total_wins, total_loss, dice_actual_sum;
        final int game_life = 10;
        tries = 0;
        total_tries = 0;
        total_wins = 0;
        total_loss = 0;
        remaining_tries = 10;
        boolean continue_throwing = true;
        for (int i = 0; i < game_life; i++) {
            while (continue_throwing) {
                dice_actual_sum = DiceGame3.generateRandom();
                System.out.println("Dice Sum is: " + dice_actual_sum);
                // generateRandom();
                System.out.printf("your dice is %d\n", dice_actual_sum);
                tries++;
                total_tries++;
                remaining_tries -= 1;
                if (dice_actual_sum == 12 && total_tries != game_life) {
                    total_wins += 1;
                    System.out.printf("Congrats, you won! play again \n%dTrials remaining\n\n", remaining_tries);
                    System.out.printf("Total Loss: %d\nTotal Win: %d\nTotal Trials: %d\nTries: %d\n\n", total_loss,
                            total_wins, total_tries, tries);
                    tries = 0;
                    // continue_throwing = false;
                } else if (dice_actual_sum == 12 && total_tries == game_life) {
                    total_wins += 1;
                    System.out.printf(
                            "Congrats, you won! Game has ended on all trials of %d and you won %d/%d times\n\n",
                            total_tries, total_wins, total_tries);
                    System.out.printf("Total Loss: %d\nTotal Win: %d\nTotal Trials: %d\nTries: %d\n\n", total_loss,
                            total_wins, total_tries, tries);
                    continue_throwing = false;
                } else if (dice_actual_sum < 12 && tries < 4) {
                    total_loss += 1;
                    System.out.printf("OOPs! You lost %d times, try again. You've got %dPoints\n\n", total_loss,
                            dice_actual_sum);
                    System.out.printf("Total Loss: %d\nTotal Win: %d\nTotal Trials: %d\nTries: %d\n\n", total_loss,
                            total_wins, total_tries, tries);

                } else if (dice_actual_sum < 12 && tries >= 4 || dice_actual_sum < 12 && total_tries == 10) {
                    total_loss += 1;
                    System.out.printf("OOPs Game over! Start again\n\n");
                    System.out.printf("Total Loss: %d\nTotal Win: %d\nTotal Trials: %d\nTries: %d\n\n", total_loss,
                            total_wins, total_tries, tries);
                    continue_throwing = false;
                }
            }
        }
        System.out.printf("You have made %d losses and %d wins in a total of %d Trials in this game\n", total_loss,
                total_wins, total_tries);

    }

    public static void main(String[] args) {
        diceResult();
        // generateRandom();

        // QUESTION: Find out why When I print only generateRandom() method it prints
        // out SystemOut, but when I call it as a member of the DiceGame3 Class, it
        // returns the value of "dice_sum" and the returning result will be (printout
        // and
        // SystemOut result)
    }
}
