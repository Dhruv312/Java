// Scenario 2: Vehicle Manufacturing
// Design an abstract class called "Vehicle" with abstract methods like "assemble" and "paint." Implement derived classes like "Car" and "Motorcycle" that provide specific implementations for these abstract methods.

abstract class Vehicle{
    abstract void assemble();
    abstract void paint();
}

class Car extends Vehicle{
    public void assemble(){
        System.out.println("This is a assemble class.....");
    }
    public void paint(){
        System.out.println("This car paint color is red.... ");
    } 
}

class Motorcycle extends Vehicle{
    public void assemble(){
        System.out.println("This is a assemble class.....");
    }
    public void paint(){
        System.out.println("This car paint color is red.... ");
    } 
}

public class Task2 {
    public static void main(String[] args){
        Car car= new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.assemble();
        car.paint();

        motorcycle.assemble();
        motorcycle.paint();
    }
}
