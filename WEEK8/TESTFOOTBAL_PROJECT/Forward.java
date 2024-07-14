public class Forward extends Player{
    private int goalsScored;
    public Forward(int goalsScored, String name, double transferFee, String nationality, int shirtNumber){
        super(name, transferFee, nationality, shirtNumber);
        this.goalsScored = goalsScored;
    }
    public void setgoalsScored(int goalsScored){
        this.goalsScored = goalsScored;
    }
    public int getgoalsScored(){
        return goalsScored;
    }
    public String toString(){
        return "Player : Name = " + getName() + ", Goals Scored = " + getgoalsScored() + ",Position = " + getshirtNumber() + ", TransferFee = $" + gettransferFee() + ", Nationality: " + getnationality();
    }
    public static void main(String[] args) {
        Forward forward9 = new Forward(26, "BOJAN MIOVSKI", 234000, "North Macedonia", 9);
        System.out.println(forward9);
        Forward forward11 = new Forward(18, "DUK", 176800, "Cape Verde", 11);
        System.out.println(forward11);
        Forward forward14 = new Forward(0, "PAPE GUÈYE", 145600, "Senegal", 14);
        System.out.println(forward14);
        Forward forward19 = new Forward(1, "ESTER SOKLER", 119600, "Slovenia", 19);
        System.out.println(forward19);
        Forward forward36 = new Forward(0, "ALFIE BAVIDGE", 0, "Scotland", 36);
        System.out.println(forward36);
    }
    
}
