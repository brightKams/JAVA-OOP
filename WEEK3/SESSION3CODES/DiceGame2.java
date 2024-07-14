public class DiceGame2 {

    public static void diceResult() {
        double guess_1, guess_2;
        int tries, remaining_tries, guess1, guess2, dice_sum;
        tries = 0;

        remaining_tries = 10;
        boolean continue_throwing = true;
        
        while (continue_throwing) {
            guess_1 = 1 + (Math.random() * 6) ;
            guess_2 = 1 + (Math.random() * 6) ;
    
            guess1 = (int) guess_1;
            guess2 = (int) guess_2;
            dice_sum = guess1 + guess2;
            remaining_tries -= 1; 
            tries++;
            System.out.println("Trial: " + tries);
            System.out.printf("Total dice throw at %d/10 is: %d\n", tries, dice_sum);
            if(dice_sum == 12 && tries != 10){
                System.out.println("You won! Continue Playing....\n");
            } else if (dice_sum == 12 && tries == 10) {
                System.out.printf("Hurray, You WON! on %d trial\n", tries);
                continue_throwing = false;
            } else if( dice_sum !=12 && tries == 10 ) {
                System.out.printf("Sorry you lost with %d points at %dth trial you have %d trials more\n ", dice_sum, tries, remaining_tries);
                continue_throwing = false;
            } else if(tries == 10 && dice_sum !=12) {
                System.out.printf("OOPs! you lost all %d tries \n", tries);
                continue_throwing = false;
            }else {
                System.out.printf("Sorry you lost with %d score at %dth trial you have %d trials remaing. Try again....\n ", dice_sum, tries, remaining_tries);
            }
            

        }
    
        System.out.printf("\n\nYou have made a total of %d trials in this game:", tries);
    }
    
    public static void main(String[] args) {

        diceResult();
    }
}


