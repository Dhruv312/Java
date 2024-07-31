package bank;

public class Customer {
    private String name;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer( String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
        this.numberOfAccounts = 0;
    }

    public String getName() { return name; }

    public void addAccount(Account account) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts] = account;
            numberOfAccounts++;
        } else {
            System.out.println("Customer cannot have more accounts.");
        }
    }

    public void displayCustomer(){
        System.out.println("Customer Name: "+name);
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Account Num: "+accounts[i].getAccountNumber()+", Balance: "+accounts[i].getBalance());
        }
    }

   
}


