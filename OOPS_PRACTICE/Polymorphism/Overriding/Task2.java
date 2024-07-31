// Scenario 2: Bank Account System
// In a bank account system, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "CurrentAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

class Account{
    protected double balance;

    public Account(double balance){
        this.balance=balance;
    }
    public void calculateInterest(){
            System.out.println("Calculating interest for a generic account");
    }
}

class SavingsAccount extends Account{
    private double integersRate;

    public SavingsAccount(double balance , double integersRate){
        super(balance);
        this.integersRate=integersRate;
    }

    public void calculateInterest(){
        double interest= balance*(integersRate/100);
        System.out.println("Calculating interest for SavingsAccount: " + interest);
    }
}

class CurrentAccount extends Account{
    private double overdraft;

    public CurrentAccount(double balance , double overdraft){
        super(balance);
        this.overdraft=overdraft;
    }
    public void calculateInterest(){
        System.out.println("No interest for CurrentAccount");
    }
}
public class  Task2{
    public static void main(String[] args){
        Account genericAccount = new Account(1000);
        genericAccount.calculateInterest();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        savingsAccount.calculateInterest();

        CurrentAccount currentAccount = new CurrentAccount(1000, 500);
        currentAccount.calculateInterest();
    }
}



// // Main class to test the implementation
// public class BankAccountSystem {
//     public static void main(String[] args) {
//         Account genericAccount = new Account(1000);
//         genericAccount.calculateInterest();

//         SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
//         savingsAccount.calculateInterest();

//         CurrentAccount currentAccount = new CurrentAccount(1000, 500);
//         currentAccount.calculateInterest();
//     }
// }



