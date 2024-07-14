public class DiceGame4 {
    
    public static int firstGuess() {
        double guess_1;
        guess_1 = 1 + Math.random() * 6;
        int guess1 =(int) guess_1;
        System.out.println("firstGuess is: " + guess1);
        return guess1;
    }
    public static int secondGuess(){
        double guess_2;
        guess_2 = 1 + Math.random() * 6;
        int guess2 =(int) guess_2;
        System.out.println("secondGuess is: " + guess2);
        return guess2;
    }

    public static void getDiceResult() {
        int secondGuess, firstGuess, diceThrowSum, tries, total_tries, total_win, total_lost, extra_moves, loop_index;
        final  int game_life ;
        boolean continue_throwing, alive, dead;
        
        tries = 0;  total_tries = 0;    total_win = 0;  total_lost = 0;   extra_moves = 0;  game_life= 10;
        continue_throwing = true;   alive = continue_throwing;  dead = false;
        for( loop_index = 0; loop_index < game_life; loop_index++){
            while (alive) {
                    firstGuess = firstGuess();  
                    secondGuess = secondGuess();    
                    diceThrowSum = firstGuess + secondGuess;
                    System.out.printf("Score Result Is: %d\n", diceThrowSum);

                    if(firstGuess == secondGuess) {
                        tries = tries + 0;
                        tries -=1; extra_moves +=1;
                        alive = dead;
                    }
                    tries +=1;
                    total_tries +=1;

                    if (tries >=4) {
                        total_lost +=1;
                        alive = dead;
                    } else if(diceThrowSum == 12) {
                        total_win +=1;
                        alive = dead;
                    }

                    alive = dead;
                }

                alive = continue_throwing;
       }

        
        System.out.printf("\nAlive: %b\nDead: %b\n", alive, dead);
        System.out.println(tries + total_tries + total_win + total_lost + extra_moves + game_life);

    }

    public static void main(String[] args) {

        getDiceResult();
    }
}
