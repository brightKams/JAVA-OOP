public class Player {

    // Fields for Player SuperClass
    public String name;
    private double transferFee;
    private String nationality;
    private int shirtNumber;

    public Player(String name, double transferFee, String nationality, int shirtNumber) {
        this.name = name;
        this.transferFee = transferFee;
        this.nationality = nationality;
        this.shirtNumber = shirtNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransferFee(double newTransferFee) {
        this.transferFee = newTransferFee;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setShirtNumber(int shortNumber) {
        this.shirtNumber = shortNumber;
    }

    public String getName() {
        return name;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public double getTransferFee() {
        return transferFee;
    }

    public String toString() {

        String st = "Player { " + "Name = " + this.getName() + 
                    ", Position = " + getShirtNumber() + 
                    ", TransferFee = £" + String.format("%d", (int)getTransferFee()) + 
                    ", Nationality = " + getNationality() + " }";
        // System.out.println(st);
        return st;
    }

    public static void main(String[] args) {
        // Player player = new Player("Rhys Williams", 41600, "England", 18);
        Player  player2 = new Player("Bright", 0, "Nigeria", 8);
        
        System.out.println(player2);
    }
}
