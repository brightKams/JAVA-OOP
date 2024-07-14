public class TestDice4 {
    public static void main(String[] args){
        @SuppressWarnings("unused")
        int tries, overall_tries, dice1, dice2, score, extra_moves, games_lost, games_won;
        boolean continue_throwing = true;
        tries = 0;
        overall_tries = 0;
        extra_moves = 0;
        games_lost = 0;
        games_won = 0;
        for(int game = 0; game < 10; game++){

            while(continue_throwing) {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                score = dice1 + dice2;
                // System.out.println("Dice Sum: " + score );
                if(dice1 == dice2) {
                    tries --;
                    extra_moves ++;
                } else if(score == 12) {
                    games_won ++;
                    continue_throwing = false;
                }
                tries = 0;
                continue_throwing = true;

            }


            System.out.printf("Overall Games Played: %d \nTotal Extra Moves: %d \nGames won: %d \nGames Lost: %d", overall_tries, extra_moves, games_won, games_lost);
        }

    }
}
