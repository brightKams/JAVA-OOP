package ACCOUNT;

public abstract class Account {
    
    private double balance;
    private int transactions ;
    // public double balance;
    // public int transactions ;

    public  Account(double balance) {
        this.balance = balance;
        this.transactions = 0;
    }

    public void withdraw(double amount) {
        this.balance -= amount ;
        // OR
        // this.balance = balance -amount;
        transactions += 1;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactions += 1;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountType() {
        // We use the class name of the subclass!
        String classType = getClass().toString();
        // The class name is Class Fee etc. Fee is what we want 
        // Hence Taking out 6 chars at the beginning
        String st = classType.substring(6);
        
        return st ;
    }

    // END MONTH
    public void endMonth() {
        // Get the subclass to perform their specific charge policy using abstract method
        processEndMonthCharge();
        String st = " " ;
        st += "Account: " + getAccountType() ;
        st += "Balance: " + this.balance + " Transaction No: " + this.transactions;
        System.out.println(st);
        transactions = 0;
    }

    public abstract void processEndMonthCharge();

}
