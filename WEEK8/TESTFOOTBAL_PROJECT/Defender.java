public class Defender extends Player{
    private int defendingMoves;
    public Defender(int defendingMoves, String name, double transferFee, String nationality, int shirtNumber){
        super(name, transferFee, nationality, shirtNumber);
        this.defendingMoves = defendingMoves;

    }
    public void setdefendingMoves(int defendingMoves){
        this.defendingMoves = defendingMoves;
    }
    public int getdefendingMoves(){
        return defendingMoves;
    }
    public String toString(){
        return "Player : Name = " + getName() + ",Defending moves =" + getdefendingMoves() + ", Position = " + getshirtNumber() + ", TransferFee = $" + gettransferFee()+ ", Nationality: " + getnationality();

    }
    public static void main(String[] args) {
        Defender defender18 = new Defender(0, "RHYS WILLIAMS", 416000,"England",18);
        System.out.println(defender18);
        Defender defender33 = new Defender(108, "SLOBODAN RUBEZIC", 135200,"Serbia",33);
        System.out.println(defender33);
        Defender defender2 = new Defender(103, "NICKY DEVLIN", 150800, "Scotland",2);
        System.out.println(defender2);
        Defender defender3 = new Defender(89, "JACK MACKENZIE", 109200,"Scotland",3);
        System.out.println(defender3);
        Defender defender5 = new Defender(93, "RICHARD JENSEN", 140400,"Finland",5);
        System.out.println(defender5);
        Defender defender6 = new Defender(115, "STEFAN GARTENMANN", 135200,"Denmark",6);
        System.out.println(defender6);
        Defender defender15 = new Defender(98, "JAMES MCGARRY", 161200, "New Zealand",15);
        System.out.println(defender15);
        Defender defender27 = new Defender(103, "ANGUS MACDONALD", 182000,"England",27);
        System.out.println(defender27);
        Defender defender28 = new Defender(0, "JACK MILNE", 47320,"Scotland",28);
        System.out.println(defender28);
        Defender defender30 = new Defender(0, "JOR DADIA", 93600,"Israel",30);
        System.out.println(defender30);

        
    }
    
}
