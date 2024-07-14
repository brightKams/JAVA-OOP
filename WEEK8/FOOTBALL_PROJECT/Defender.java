public class Defender extends Player {
    // Field for Defender subclass
    // This is the attacking or defending moves added together
    private int defendingMoves;

    public Defender(int defendingMoves, String name, double transferFee, String nationality, int shirtNumber) {
        super(name, transferFee,  nationality, shirtNumber);
        this.defendingMoves = defendingMoves;
    }
    public void setDefendingMoves( int newDefendingMoves) {
        this.defendingMoves = newDefendingMoves;
     }

     public int getDefendingMoves() {
        return this.defendingMoves;
     }

    public String getDetails() {
        String st;
        st = super.toString() + "\n\tDefender{ " + "Defending moves = " + defendingMoves + " }" ;

        return st ;
    }

    // public static void main(String[] args) {
    //     Defender defender18 = new Defender(0, "RHYS WILLIAMS", 41600, "England", 18);
    //     Defender defender33 = new Defender(108, "SLOBODAN RUBEZIC", 135200, "Serbia", 33);
    //     Defender defender2 = new Defender(103, "NICKEY DELVIN",    150800, "Scotland", 2);
    //     Defender defender3 = new Defender(89, "JACK MACKENZIE", 109200, "Scotland", 3);
    //     Defender defender5 = new Defender(93,"RICHARD JENSEN", 140400, "Finland", 5);
    //     Defender defender6 = new Defender(115, "STEFAN GARTENMANN", 135200, "Denmark", 6);
    //     Defender defender15 = new Defender(98, "JAMES MCGARRY", 161200, "New ZEALAND", 15);
    //     Defender defender27 = new Defender(103, "ANGUS MACDONALD", 182000, "England",  27);
    //     Defender defender28 = new Defender(0, "JACK MILNE", 47320, "Scotland", 28);
    //     Defender defender30 = new Defender(0, "JOR DADIA", 93600, "Israel", 30);
    //     System.out.println(defender18.getDetails() + "\n" + defender33.getDetails() + "\n" + defender2.getDetails() + "\n" + defender3.getDetails() + "\n" + defender5.getDetails() + "\n" + defender6.getDetails() + "\n" + defender15.getDetails() + "\n" + defender27.getDetails() + "\n" + defender28.getDetails() + "\n" + defender30.getDetails());
    // }
}
