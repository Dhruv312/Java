// Scenario 9: Shopping Cart System
// Develop an abstract class called "CartItem" with abstract methods like "calculatePrice" and "displayDetails." Implement derived classes like "ElectronicsItem" and "ClothingItem" that provide specific implementations for these abstract methods.

abstract class CartItem{
    protected String name;
    protected double price;
    protected int quantity;

    public CartItem(String name , double price , int quantity){
        this.name= name;
        this.price = price;
        this.quantity = quantity;
    }


    abstract double calculatePrice();
    abstract void displayDetails();

}

class ElectronicsItem extends CartItem{
    private float gstRate;

    public ElectronicsItem(String name , double price , int quantity ,float gstRate){
        super(name, price, quantity);
        this.gstRate  = gstRate;
    }

    public double calculatePrice(){
        return price+(gstRate*price);
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Price : "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Price: "+calculatePrice());
        System.out.println("GST RATE: "+gstRate);
    }
}

class ClothingItem extends CartItem{
    private double discount;

    public ClothingItem(String name , double price , int quantity ,double discount){}
    
}

public class Task9 {
    public static void main(String[] args) {
        
    }
}
