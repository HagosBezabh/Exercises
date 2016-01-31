package bankapplication;
public class CheckingsAccount 
extends Account {
    
    public void addInterest(){
        //deposit(getAmount()*interest_rate/2);
        double amount = deposit(getAmount()*interest_rate/2);
        System.out.println("The Interest rate is: "+ amount);
    }
}
