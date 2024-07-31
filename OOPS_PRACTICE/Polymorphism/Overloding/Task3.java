// Scenario 1: Payment Processing System
// In a payment processing system, implement method overloading for processing payments. Create different methods with different parameter combinations, such as processing a credit card payment, processing a bank transfer, and processing a cash payment.

class Payment{
     public void processing(String accoountNum){
        System.out.println("processing a bank transfer so My Bank account Num is "+accoountNum);
     } 
     public void processing(int card){
        System.out.println("processing a credit card payment so My credit card Num is "+card);        
     }

     public void processing(double amount){
        System.out.println("processing a cash payment "+amount);        
     }
}

public class Task3 {
    public static void main(String[] args){
        Payment payment = new Payment();
        payment.processing(1000.0);
        payment.processing(1202);
        payment.processing("9834892929");
    }
}
