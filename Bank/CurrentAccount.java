public class CurrentAccount extends Account{

    double overdraft = -100.0; 
    public CurrentAccount(int a){
        super(a);
         
    }

    public void setOverdraft(double overdraft){
        this.overdraft=overdraft; 
    }

    public void withdraw(double sum){
        if (bal-sum<overdraft){
        System.out.println ("CurrentAccount.withdraw(...):"+"cannot withdraw below "+ overdraft ); 
    }
        else{
            super.withdraw(sum); }
    }


}