// Scenario 3: Online Banking Application
// In an online banking application, encapsulate the "Account" class's balance and transaction history to protect the customer's financial information and ensure that interactions with the account are performed through controlled methods.

class Account{
    private double balance;
    private String []transactionHistory;
    private int transactionCount;

    public Account(double initialBalance){
        this.balance = initialBalance;
        this.transactionHistory = new String[10];
        this.transactionCount = 0;
        addTransaction("Initial balance: "+initialBalance);
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            addTransaction("Deposit: "+amount);
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance-=amount;
            addTransaction("Withdrew: "+amount);
        }
    }

    public void displayTransaction(){
        System.out.println("Transaction History: ");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactionHistory[i]);
        }
    }

    private void addTransaction(String transaction) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount] = transaction;
            transactionCount++;
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Account account = new Account(1000.0);

        account.deposit(200);
        account.withdraw(150);

        System.out.println("Current balance: "+account.getBalance());

        account.displayTransaction();
    }
}
