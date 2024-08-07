// Scenario 3: Banking System
// Develop an abstract class called "Account" with abstract methods like "deposit" and "withdraw." Implement derived classes like "SavingsAccount" and "CurrentAccount" that provide specific implementations for these abstract methods.

abstract class Account{
    protected String accountNum;
    protected double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public Account(String accountNum,double balance){
        this.accountNum=accountNum;
        this.balance=balance;
    }
}

class SavingsAccount extends Account{
    
    public SavingsAccount(String accountNum,double balance){
        super(accountNum, balance);
    }

    
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Balance after deposit is: "+balance);
        }else{
            System.out.println("Does not deposit amout...");
        }
    }

    public void withdraw(double amount){
        if (amount-balance>100) {
            balance-=amount;
            System.out.println("Balace after Withdraw is: "+balance);
        }else{
            System.out.println("Does not withdraw amount...");
        }
    }
}

class CurrentAccount extends Account{
    public CurrentAccount(String accountNum,double balance){
        super(accountNum, balance);
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Balance after deposit is: "+balance);
        }else{
            System.out.println("Does not deposit amout...");
        }
    }

    public void withdraw(double amount){
        if (amount-balance>100) {
            balance-=amount;
            System.out.println("Balace after Withdraw is: "+balance);
        }else{
            System.out.println("Does not withdraw amount...");
        }
    }
} 
public class Task3 {
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount("12345678", 100000);
        CurrentAccount currentAccount = new CurrentAccount("321464466",50000);

        savingsAccount.deposit(1000);
        currentAccount.deposit(2000);
    }
}
