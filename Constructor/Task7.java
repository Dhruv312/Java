
// 7. Parameterized Constructor with Default Values:
//    Design a 'Laptop' class with fields 'brand', 'model', and 'price'. Implement a constructor that takes 'brand' and 'model' as parameters and sets a default price. Also, implement another constructor that initializes all three fields.

class Laptop{
    private String brand;
    private int model;
    private double price;

    public Laptop(String brand,int model){
        this.brand=brand;
        this.model=model;
        price=1000;
    }

    public Laptop(String brand,int model,double price){
        this. brand=brand;
        this.model=model;
        this.price=price;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class Task7 {
    public static void main(String[] args){
        Laptop l1=new Laptop("Dell", 2001);
        l1.display();
        Laptop l2=new Laptop("Lenova", 2000,1000);
        l2.display();
    }
}
