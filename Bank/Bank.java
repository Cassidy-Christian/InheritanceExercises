import java.util.ArrayList; 
public class Bank{
    // Account[] accounts= new Account[5]; 
    ArrayList<Account> accounts; 
    int acc=0; 

    public Bank(){ 
        accounts = new ArrayList<>(); 
    }
    public void update(){
    for( int i=0; i<accounts.size(); i++){
        if(accounts.get(1)==null){

        }
        else if(accounts.get(i) instanceof SavingsAccount){
            ((SavingsAccount)accounts.get(i)).addInterest(); 
        }
        else if(accounts.get(i) instanceof CurrentAccount){
            if(accounts.get(i).getBalance()<0)
            System.out.println("Notice:you are below 0!");
        }
    }
}

    public void openSavingsAccount(){
            accounts.add(new SavingsAccount(acc++)); 
    }
    public void openCurrentAccount(){
        accounts.add(new CurrentAccount(acc++)); 
    }
    public void closeAccount(int account){
        if(account>=0 && account<accounts.size())
        accounts.set(account, null); 
    }
}

