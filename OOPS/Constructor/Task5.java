// 5. Constructor with Validation:
//    Write a 'BankAccount' class with fields for 'accountNumber' and 'balance'. The constructor should validate that the 'balance' is not negative. If it is, set the balance to 0 and print a warning message.
class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNUmber,double balance){
        this.accountNumber=accountNUmber;
        if(balance<0){
            balance=0;
            System.out.println("Balance cannot be negative");
        }else{
            this.balance=balance;
        }
    }
    void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }

}
public class Task5 {
    public static void main(String[] args){
        BankAccount b1=new BankAccount("1423999292", 100);
        b1.display();
    }
}
