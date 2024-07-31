package bank;

public class Transaction {
    private Account account;
    private double amount;
    private String type; // "deposit" or "withdrawal"

    public Transaction(Account account, double amount, String type) {
        this.account = account;
        this.amount = amount;
        this.type = type;
    }

    public Account getAccount() { return account; }

    public double getAmount() { return amount; }

    public String getType() { return type; }

    public void execute() {
        if (type.equals("deposit")) {
            account.deposit(amount);
        } else if (type.equals("withdrawal")) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }

    @Override
    public String toString() {
        return "Transaction{account=" + account + ", amount=" + amount + ", type='" + type + "'}";
    }
}
