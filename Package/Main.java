import bank.Acccount;
import bank.Customer;
import bank.Transaction;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("ACC123", 1000.0);
        Account account2 = new Account("ACC456", 2000.0);

        Customer customer = new Customer( "John Doe", 5);
        customer.addAccount(account1);
        customer.addAccount(account2);

        System.out.println(customer.displayCustomer());

        Transaction transaction1 = new Transaction("TXN001", account1, 500.0, "deposit");
        transaction1.execute();

        Transaction transaction2 = new Transaction("TXN002", account2, 300.0, "withdrawal");
        transaction2.execute();

        System.out.println(account1);
        System.out.println(account2);
    }
}
