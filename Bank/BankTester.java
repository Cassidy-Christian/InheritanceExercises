public class BankTester{

    public static void main(String[] args){
        // SavingsAccount account = new SavingsAccount(12345);
        // CurrentAccount account2 = new CurrentAccount(67890); 

        // account.deposit(200); 
        // account.setInterestVar(0.10); 
        // account.addInterest(); 
        // account.print(); 

        // account2.withdraw(200); 
        // account2.print(); 

        Bank bank = new Bank(); 

        bank.update();
        bank.openSavingsAccount();
        bank.openCurrentAccount(); 
        

    }
    
}