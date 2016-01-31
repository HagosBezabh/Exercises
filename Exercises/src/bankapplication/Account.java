package bankapplication;
public abstract class Account{
    private double current_amount;
    protected double interest_rate;
    private String accountnr;
    
    public double deposit(double amount){
        return current_amount+=amount;
    }
    public void withdraw(long amount){
        current_amount-=amount;
    }
    public void setAccountnr(String anr){
        accountnr=anr;
    }
    public String getAccountnr(){
        return accountnr;
    }
    public double getAmount(){
       return current_amount;
    }
    public abstract void addInterest();
}
