// Scenario 1: Vehicle Hierarchy
// Consider a vehicle hierarchy where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Define common attributes and behaviors in the base class and specific attributes and behaviors in the derived classes.

class Vehicle{
    protected String name;
    protected double price;

    public Vehicle(String name ,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}

class Car extends Vehicle{
    private String model;

    public Car(String name,double price, String model){
        super(name, price);
        this.model=model;
    }

    public void display(){
        System.out.println("Car Infomation:");
        super.display();
        System.out.println("Brand: "+model);
    }
}

class Motorcycle extends Vehicle{
    private  String type;

    public Motorcycle(String name,double price,String type){
        super(name, price);
        this.type=type;
    }

    public void display(){
        System.out.println("Motorcycle Infomation:");
        super.display();
        System.out.println("Type: "+type);
    }
}

class Truck extends Vehicle{
    private float loadcapacity;

    public Truck(String name, double price,float loadcapacity){
        super(name, price);
        this.loadcapacity=loadcapacity;
    }

    public void display(){
        System.out.println("Truck Infomation:");
        super.display();
        System.out.println("Load Capacity: "+loadcapacity);
    }

}
public class Task1 {
    public static void main(String[] args){
        Car car=new Car("Kia", 100000, "Kia Sonet");
        car.display();
        
    }
}
