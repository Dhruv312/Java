// Scenario 5: Bank Account Inheritance
// Create a bank account hierarchy with a base class called "Account" and derived classes like "SavingsAccount" and "CheckingAccount." The base class can define common attributes and methods, while the derived classes can have additional features specific to their account types.

class Account{
    protected String name;
    protected double balance;
    protected String account_num;

    public Account(String name , double balance , String account_num){
        this.name = name;
        this.balance=balance;
        this.account_num=account_num;
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw after balance: "+balance);
        }else{
            System.out.println("do not widraw amount because unsufficient");
        }
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit after balance: "+balance);
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("Account Number: "+account_num);
    }
}

class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(String name, double balance , String account_num ,double interestRate){
        super(name, balance, account_num);
        this.interestRate = interestRate;
    }

    public void intrestRate(){
        double interest = balance * (interestRate/100);
        super.deposit(interest);
        System.out.println("Interest applied: "+interest);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Interest Rate: "+interestRate);
    }
}

class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(String name , double balance , String account_num , double overdraftLimit){
        super(name, balance, account_num);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount){
        if(amount > 0 &&  amount<=(balance+overdraftLimit)){
            double newBalance= balance-amount;
            if (newBalance<0) {
                overdraftLimit+=newBalance;
                newBalance=0;
                System.out.println("Overdraft used: "+(amount-balance));
            }
            super.withdraw(amount);
        }else{
            System.out.println("do not widraw amount because unsufficient balance");
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Overdraft Limit: "+overdraftLimit);
    }

}
public class Task5 {
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount("Himesh", 1000.0, "S12345", 5.0);
        CheckingAccount checkingAccount = new CheckingAccount("Meet", 500.0, "C12345", 200);

        System.out.println("Saving Account Info:");
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        savingsAccount.intrestRate();
        savingsAccount.displayInfo();

        System.out.println("\nChacking Account Info:");
        checkingAccount.displayInfo();
        checkingAccount.deposit(300);
        checkingAccount.withdraw(700);
        checkingAccount.withdraw(300);
        
        checkingAccount.displayInfo();


    }
}
