package bankapplication;
import java.util.ArrayList;

public class Bank{
    private ArrayList<Account> accountslist;
    
    /*public void addInterest_all_accounts(){
        Account account;
        for (int x=0; x<accountslist.size(); x++){
           account=(Account)accountslist.get(x);
           account.addInterest(); // POLYMORPHISM HERE!!
        }
    }*/
    public void addInterest_all_accounts(){
        Account account;
        for (Account acct: accountslist){
           acct.addInterest(); // POLYMORPHISM HERE!!
        }
    }
    
    public void addAccount(String type, String accountnr){
        Account account;
        
        if (type.equals("checking")){
            account = new CheckingsAccount();
            account.setAccountnr(accountnr);
            accountslist.add(account);
        }   
    }
    
    /*public void delAccount(String accountnr){
        Account account;
        for (int x=0; x<accountslist.size(); x++){
           account=(Account)accountslist.get(x);
           if (account.getAccountnr().equals(accountnr)){
              accountslist.remove(x);
              break;
           }
        }       
    }*/
    public void delAccount(String accountnr){
        //Account account;
        for (Account acct:accountslist){
           //account=(Account)accountslist.get(x);
           if (acct.getAccountnr().equals(accountnr)){
              accountslist.remove(acct);
              break;
           }
        }       
    }

}

    