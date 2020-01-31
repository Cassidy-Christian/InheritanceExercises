public class SavingsAccount extends Account{

    private double interestVar = 0.0107; 
    private int years; 
    private int n; 
    public SavingsAccount(int a){
        super(a); 
    }

    // public void numberOfDays(int years){
    //     this.years=years; 
    // }
    // public void numberOfCompounds(int n){
    //     this.n=n; 
    // }

    public void setInterestVar(double interestVar){
        this.interestVar=interestVar; 
    }

    public double addInterest(){
        bal += bal*interestVar; 
        return bal;  
    }
    
}