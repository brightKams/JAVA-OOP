package ACCOUNT;
public class TransFeeAccount extends Account{
    private int withdrawCount;
    private final double withdrawCharge = 0.5 ;
    public TransFeeAccount(double balance) {
        super(balance);
        this.withdrawCount = 0;
    }

    public void withdraw(double amount) {
        withdraw(amount);
        this.withdrawCount +=1;
    }

    public void processEndMonthCharge(){
       withdraw(withdrawCount * this.withdrawCharge);
        withdrawCount = 0;
    }
}
