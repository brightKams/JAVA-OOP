public class Midfielder extends Player {
    
    private int importantMoves ;
    private int goalScored;
    

    // Specialised Constructor
    public Midfielder (int importantMoves, int goalScored, String name, double transferFee, String nationality, int shirtNumber) {
        super(name, transferFee, nationality, shirtNumber);
        this.importantMoves = importantMoves;
        this.goalScored = goalScored;

    }
    public int getImportantMoves() {
        
        return this. importantMoves;
    }

    public int getGoalScored() {
        return this.goalScored;
    }


    public void setImportantMoves(int goalSaved) {
        this.importantMoves = goalSaved;
    }

    public void setGoalsScored(int goalScored) {
        this.goalScored = goalScored;
    }

    public String getDetails() {
        String st = super.toString() + "\n\tMidfielder { " + "Important Moves = " + importantMoves + " }";
        return st;
    }

    // public static void main(String[] args) {
    
    //     Midfielder midfielder4 = new Midfielder(139, 15, "GRAEME SHINNIE",218400, "Scotland", 4);
    //     Midfielder midfielder7 = new Midfielder(155, 4, "JAMMIE MCGRATH",161200, "Scotland", 4);
    //     Midfielder midfielder8 = new Midfielder(153, 1, "CONNOR BARRON",45760, "Scotland", 8);
    //     Midfielder midfielder23 = new Midfielder(0, 1, "RYAN DUNCAN",36400, "Scotland", 23);
    //     Midfielder midfielder32 = new Midfielder(0, 0, "FINDLAY MARSHALL",28600, "Scotland", 32);
    //     Midfielder midfielder10 = new Midfielder(110, 6, "LEIGHTON CLARKSON",312000, "England", 10);
    //     Midfielder midfielder22 = new Midfielder(0, 5, "VICENTE BESUIJEN",78000, "Netherlands", 22);
    //     Midfielder midfielder20 = new Midfielder(0, 0, "SHAYDEN MORRIS",135200, "England", 20);
    //     Midfielder midfielder21 = new Midfielder(155, 2, "DANTE POLVARA",72800, "United States", 21);
    //     Midfielder midfielder17 = new Midfielder(143, 28, "JONNY HAYES",109200, "Ireland", 17);

    //     System.out.println(midfielder4.getDetails() + "\n" + midfielder7.getDetails() + "\n" + midfielder8.getDetails() + "\n" + midfielder23.getDetails() + "\n" + midfielder32.getDetails() + "\n" + midfielder10.getDetails() + "\n" + midfielder22.getDetails() + "\n"  + midfielder20.getDetails() + "\n" + midfielder21.getDetails() + "\n" + midfielder17.getDetails());
        
    
    // }

    


}
