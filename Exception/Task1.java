// 1. Custom Exception in Banking System: Develop a simplified banking system in Java that utilizes custom exceptions using the 'throw' keyword. Implement scenarios where 'throw' is used to handle insufficient balance or invalid transaction exceptions.

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Task1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            account.deposit(500.0);
            System.out.println("Balance after deposit: $" + account.getBalance());

            account.withdraw(200.0);
            System.out.println("Balance after withdrawal: $" + account.getBalance());

            account.withdraw(1500.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
