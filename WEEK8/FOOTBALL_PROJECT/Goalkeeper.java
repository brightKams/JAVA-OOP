public class Goalkeeper extends Player {
    // Field for Goalkeeper subclass

    private int goalSaved  ;

    // Specialised constructor
    public Goalkeeper (int goalSaved, String name, double transferFee, String nationality, int shirtNumber) {
        super(name, transferFee, nationality, shirtNumber);
        this.goalSaved = goalSaved;
    }
    public int getGoalsSaved() {
        return this.goalSaved;
    }

    public String getDetails() {
        String st;
       st = super.toString() + "\n\tGoalKeeper{ " + "Defending moves = " + goalSaved + " }" ;
        
        return st ;
    }
    // public static void main(String[] args) {

    //     Goalkeeper goalkeeper24 = new Goalkeeper(72, "KELLE ROOS", 208000, "Netherlands", 24);
    //     Goalkeeper goalkeeper25 = new Goalkeeper(0, "TOM RITCHIE", 36920, "Scotland", 25);
    //     Goalkeeper goalkeeper31 = new Goalkeeper(51, "ROSS DOOHAN", 140400, "Scotland", 31);
    //     System.out.println(goalkeeper24.getDetails());
    //     System.out.println(goalkeeper25.getDetails());
    //     System.out.println(goalkeeper31.getDetails());

    // }





}
