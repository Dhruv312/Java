// 1. Single Inheritance Problem:
//    - Problem Statement: Implement a basic single inheritance hierarchy with two classes: 'Vehicle' (base class) and 'Car' (derived class). The 'Vehicle' class should have attributes like 'brand' and 'speed', and a method 'displayInfo()'. The 'Car' class should inherit from 'Vehicle', add an attribute 'model', and override the 'displayInfo()' method to include the 'model' information. Use constructors to initialize these attributes and utilize 'this' and 'super' keywords effectively.

class Vehicle{
    private String brand;
    private int speed;

    public Vehicle(String brand ,int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public void  displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }
}

class Car extends Vehicle{
    private int model;

    public Car(String brand,int speed,int model){
        super(brand,speed);
        this.model=model;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Model: "+model);
    }
}
public class Task1 {
   public static void main(String[] args){
     Car c1=new Car("suzuci",120,2012);
     c1.displayInfo();
   } 
}
