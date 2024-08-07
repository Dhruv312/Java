// 10. Using This and Super with Multiple Levels of Inheritance:
//     - Problem Statement: Create a multilevel inheritance hierarchy with classes 'Electronics', 'Computer', and 'Laptop'. The 'Electronics' class should have attributes 'brand' and 'price', and a method 'showDetails()'. The 'Computer' class should add 'processorType' and override 'showDetails()'. The 'Laptop' class should add 'batteryLife' and further override 'showDetails()'. Use constructors, 'this', and 'super' to demonstrate proper initialization and method calls.

class Electronics{
    protected String brand;
    protected double price;

    public Electronics(String brand,double price){
        this.brand=brand;
        this.price=price;
    }

    public void showDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("price: "+price);
    }
}

class Computer extends Electronics{
    private String processorType;

    public Computer(String brand,double price, String processorType){
        super(brand, price);
        this.processorType=processorType;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Processor Type: "+processorType);
    }
}

class Laptop extends Computer{
    private double batterylife;

    public Laptop(String brand,double price,String processorType, double batterylife ){
        super(brand, price,processorType);
        this.batterylife=batterylife;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Battery Life: "+batterylife+"hour");
    }
}

public class Task10{
    public static void main(String[] args){
        Computer c1=new Computer("Dell",12000, "Intel i7");
        Laptop l1= new Laptop("Apple", 100000, "M1",10);
        System.out.println("Computer Details: ");
        c1.showDetails();
        System.out.println("Laptop Details: ");
        l1.showDetails();
    }
}