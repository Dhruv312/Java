// Scenario 1: Payment Gateway Integration
// Design an interface called "PaymentGateway" with methods like "processPayment" and "refundPayment." Implement classes like "PayPalGateway" and "StripeGateway" that provide specific implementations for these interface methods.

interface PaymentGateway{
    void processPayment(double amount);
    void refundPayment(double amount);
}

class PayPalGateway implements PaymentGateway{
    
    @Override
    public void processPayment(double amount){
        System.out.println("Processing paypal payment: "+amount);
    }

    @Override
    public void refundPayment(double amount){
        System.out.println("Refunding paypal payment: "+amount);
    } 
}

class StripeGateway implements PaymentGateway{
    
    @Override
    public void processPayment(double amount){
        System.out.println("Processing stripe payment: "+amount);
    }

    @Override
    public void refundPayment(double amount){
        System.out.println("Refunding stripe payment: "+amount);
    } 
}


public class Task1 {
    public static void main(String[] args) {
       PaymentGateway paypal = new PayPalGateway();
       PaymentGateway stripe = new StripeGateway();

       paypal.processPayment(120);
       paypal.refundPayment(40);

       stripe.processPayment(300);
       stripe.refundPayment(100);
    }
}
