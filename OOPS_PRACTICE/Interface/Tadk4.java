// Scenario 4: Online Ordering System
// Design an interface called "OrderProcessor" with methods like "placeOrder" and "cancelOrder." Implement classes like "CreditCardProcessor" and "PayPalProcessor" that provide specific implementations for these interface methods.

interface OrderProcessor{
    void placeOrder(String orderDetails);
    void cancelOrder(String orderId);
}

class CreditCardProcessor implements OrderProcessor{

    @Override
    public void placeOrder(String orderDetails){
        System.out.println("Placing order using credit card: "+orderDetails);
    }

    @Override
    public void cancelOrder(String orderId){
        System.out.println("Cancelling order using credir card: "+orderId);
    }
}

class PayPalProcessor implements OrderProcessor{
    @Override
    public void placeOrder(String orderDetails){
        System.out.println("Placing order using PayPal: "+orderDetails);
    }

    @Override
    public void cancelOrder(String orderId){
        System.out.println("Cancelling order using PayPal: "+orderId);
    }
}
public class Tadk4 {
    public static void main(String[] args) {
        OrderProcessor creditCardProcessor = new CreditCardProcessor();
        OrderProcessor payPalProcessor = new PayPalProcessor();

        creditCardProcessor.cancelOrder("Order Id 123");
        creditCardProcessor.placeOrder("Order for Apple Id 123");

    }
}
