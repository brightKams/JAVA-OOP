package ACCOUNT;
public class BasicFlatAccount extends Account {
    private double charge = 5.0 ;
    public BasicFlatAccount(double balance) {
        super(balance);
    }

    public void processEndMonthCharge() {
        withdraw(charge);
    }

    
    
}
