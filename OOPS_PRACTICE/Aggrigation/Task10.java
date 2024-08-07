// Scenario 10: Bank Customer Account Management
// Design a bank account management system where a customer can have multiple bank accounts. The customer class contains a list of account objects, representing an aggregation relationship.


import java.util.Scanner;
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

class Customer {
    private String name;
    private Account[] accounts;
    private int accountCount;

    public Customer(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
        this.accountCount = 0;
    }

    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = account;
            accountCount++;
        } else {
            System.out.println("Cannot add more accounts.");
        }
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                for (int j = 0; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[--accountCount] = null;
                System.out.println("Deleted Account with account num: " + accountNumber);
            }
        }
        System.out.println("Account with account num: " + accountNumber + " not found");
    }

    public Account findAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void updateDestination(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                int choice;
                do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>Account num");
                    System.out.println("2------------>Balance");
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the new Account num:- ");
                            sc.nextLine();
                            String account = sc.nextLine();
                            accounts[i].setAccountNumber(account);
                            break;
                        case 2:
                            System.out.println("Enter the new balance:- ");
                            sc.nextLine();
                            double bal = sc.nextInt();
                            accounts[i].setBalance(bal);
                            break;

                        case 0:
                            break;
                        default:
                            System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The account is updated succesfully.");

                return;
            }
        }
    }

    public void displayAccounts() {
        System.out.println(name + "'s Accounts:");
        for (int i = 0; i < accountCount; i++) {
            System.out.println(accounts[i]);
        }
    }
}

public class Task10 {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", 5);

        Account account1 = new Account("123456789", 5000);
        Account account2 = new Account("987654321", 15000);
        Account account3 = new Account("555555555", 3000);

        customer.addAccount(account1);
        customer.addAccount(account2);
        customer.addAccount(account3);

        customer.displayAccounts();

        System.out.println("\nRemoving account '987654321'...");
        customer.removeAccount("987654321");
        customer.displayAccounts();
    }
}
