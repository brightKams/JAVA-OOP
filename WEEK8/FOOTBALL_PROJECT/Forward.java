public class Forward extends Player{
    private int goalScored ;

    public Forward(int goalScored, String name, double transferFee, String nationality, int shirtNumber ) {
        super(name, transferFee,  nationality, shirtNumber);
        this.goalScored = goalScored;
    }

    public int getGoalScored(){
        return this.goalScored;
    }

    public void setGoalsScored(int goalScored) {
        this.goalScored = goalScored;
    }

    public String getDetails() {
        String st = super.toString() + "\n\tForward{ Goals Scored = " + goalScored + "}" ;

        return st;
    }

    // public static void main(String[] args) {
    //     Forward forward9 = new Forward(26, "BOJAN MIVOSKI", 234000, "North Macedona", 9);
    //     Forward forward11 = new Forward(18, "DUK", 176800, "Cape verde", 11);
    //     Forward forward14 = new Forward(0, "PAPE GUEYE", 145600, "Senegal", 14);
    //     Forward forward19 = new Forward(1, "ESTER SOKLER", 119600, "Slovenia", 19);
    //     Forward forward36 = new Forward(0, "ALFIE BAVIDGE", 0, "Scotland", 36);

    //     System.out.println(forward9.getDetails() + "\n" + forward11.getDetails() + "\n" + forward14.getDetails() + "\n" + forward19.getDetails() + "\n" + forward36.getDetails());
    // }


}
