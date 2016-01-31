package bankapplication;
public class SavingsAccount 
extends Account {
    
    public void addInterest(){
        double amount = deposit(getAmount()*interest_rate);
        System.out.println("The Interest rate is: "+ amount);
    }
}