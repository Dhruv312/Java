// Scenario 2: Banking Application
// In a banking application, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "LoanAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.


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

class LoanAccount extends Account{
    private double integersRate;

    public LoanAccount(double balance , double integersRate){
        super(balance);
        this.integersRate=integersRate;
    }

    public void calculateInterest(){
        double interest= balance*(integersRate/100);
        System.out.println("Calculating interest for LoanAccount: " + interest);
    }
}
public class  Task4{
    public static void main(String[] args){
        Account genericAccount = new Account(1000);
        genericAccount.calculateInterest();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        savingsAccount.calculateInterest();

        LoanAccount loanAccount = new LoanAccount(1000, 10);
        loanAccount.calculateInterest();
    }
}

