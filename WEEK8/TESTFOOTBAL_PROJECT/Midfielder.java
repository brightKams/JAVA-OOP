public class Midfielder extends Player {
    private int importantMoves;
    private int goalScored;

    public Midfielder(int importantMoves, int goalScored, String name, double transferFee, String nationality, int shirtNumber){
        super(name, transferFee, nationality, shirtNumber);
        this.importantMoves = importantMoves;
        this.goalScored = goalScored;


    }
    public void setimportantMoves(int importantMoves){
        this.importantMoves = importantMoves;
    }
    public int getimportantMoves(){
        return importantMoves;
    }
    public void setgoalScored(int goalScored){
        this.goalScored = goalScored;
    }
    public int getgoalScored(){
        return goalScored;
    }
    public String toString(){
        return "Player: Name = " + getName() + ", Important moves " + getimportantMoves() + ", Goal scored = " + getgoalScored() + ", Position = " + getshirtNumber() + ", TransferFee = $" + gettransferFee()+ ", Nationality: " + getnationality();
    }

    public static void main(String[] args) {
        Midfielder midfielder4 = new Midfielder(139, 15, "GRAEME SHINNIE", 218400, "Scotland", 4);
 System.out.println(midfielder4);
 Midfielder midfielder7 = new Midfielder(155, 4, "JAMIE MCGRATH", 161200, "Ireland", 7);
 System.out.println(midfielder7);
 Midfielder midfielder8 = new Midfielder(153, 1, "CONNOR BARRON", 45760, "Scotland", 8);
 System.out.println(midfielder8);
 Midfielder midfielder23 = new Midfielder(0, 1, "RYAN DUNCAN", 36400, "Scotland", 23);
 System.out.println(midfielder23);
 Midfielder midfielder32 = new Midfielder(0, 0, "FINDLAY MARSHALL", 28600, "Scotland", 32);
 System.out.println(midfielder32);
 Midfielder midfielder10 = new Midfielder(110, 6, "LEIGHTON CLARKSON", 312000, "England", 10);
 System.out.println(midfielder10);
 Midfielder midfielder22 = new Midfielder(0, 5, "VICENTE BESUIJEN", 78000, "Netherlands", 22);
 System.out.println(midfielder22);
 Midfielder midfielder20 = new Midfielder(0, 0, "SHAYDEN MORRIS", 135200, "England", 20);
 System.out.println(midfielder20);
 Midfielder midfielder21 = new Midfielder(155, 2, "DANTE POLVARA", 72800, "United States", 21);
 System.out.println(midfielder21);
 Midfielder midfielder17 = new Midfielder(143, 28, "JONNY HAYES", 109200, "Ireland", 17);
 System.out.println(midfielder17); 
        
    }
    
}
