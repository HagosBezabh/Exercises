package bankapplication;
public class Application{
    static public void main(String args[]){
        Bank mybank = new Bank();
        mybank.addAccount("checking", "1");
        mybank.addAccount("checking", "2");
        mybank.addAccount("savings", "3");
        
        mybank.addInterest_all_accounts();
    }
}
