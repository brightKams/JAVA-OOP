public class Goalkeeper extends Player{
    private int goalsSaved;
    public Goalkeeper(int goalsSaved, String name, double transferFee, String nationality, int shirtNumber){
        super(name, transferFee, nationality, shirtNumber);
        this.goalsSaved = goalsSaved;
        
    }
    public void setgoalsSaved(int goalsSaved){
        this.goalsSaved = goalsSaved;
    }
    public int getgoalSaved(){
        return goalsSaved;
    }
    public String toString(){
        return "Player: " + " Name = " + getName() + ", Goal saved = " + getgoalSaved() + ", Position = " + getshirtNumber() + ", TransferFee = $" + gettransferFee()+ ", Nationality: " + getnationality();
    }

    public static void main(String[] args) {
        Goalkeeper goalkeeper24 = new Goalkeeper(72, "KELLE ROOS", 208000, "Netherlands", 24);
        System.out.println(goalkeeper24.toString());
        Goalkeeper goalkeeper25 = new Goalkeeper(0, "TOM RITCHIE", 36920, "Scotland", 25);
        System.out.println(goalkeeper25.toString());
        Goalkeeper goalkeeper31 = new Goalkeeper(51, "ROSS DOOHAN", 140400, "Scotland", 31);
        System.out.println(goalkeeper31.toString());
        
    }
    
    
}
