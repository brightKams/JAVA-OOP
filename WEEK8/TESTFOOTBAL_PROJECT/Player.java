public class Player {
    private String name;
    private double transferFee;
    private String nationality;
    private int shirtNumber;
    

    public Player(String name, double transferFee, String nationality, int shirtNumber){
        this.name = name;
        this.transferFee = transferFee;
        this.nationality = nationality;
        this.shirtNumber = shirtNumber;
        
    }
    public void setName(String name){
        this.name = name;
    }
    public void settransferFee(double transferFee){
        this.transferFee = transferFee;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setshirtNumber(int shirtNumber){
        this.shirtNumber = shirtNumber;
    }
    public String getName(){
        return this.name;
    }
    public double gettransferFee(){
        return this.transferFee;
    }
    public String getnationality(){
        return this.nationality;
    }
    public int getshirtNumber(){
        return this.shirtNumber;
    }
    public String toString(){
        return "Player: " + " Name = " + getName() + ", Position = " + getshirtNumber() + ", TransferFee = $" + gettransferFee() + ", Nationality: " + getnationality();
    }

    public static void main(String[] args) {
        Player player = new Player("Marcus Rashford", 416000,"England",18);
        System.out.println(player);
        
    }
    
}
