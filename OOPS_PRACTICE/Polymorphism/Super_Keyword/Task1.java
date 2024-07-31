// Scenario 1: Vehicle Manufacturing
// In a vehicle manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

class Vehicle{
    void manufacture(){
        System.out.println("Manufactuting Vehicle: Bacic assembly steps");
    }
}

class Car extends Vehicle{
    void manufacture(){
        super.manufacture();
        System.out.println("Manufactuting Car: Adding Car spacific features");
    }
}

public class Task1 {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        System.out.println("Vehicle Manufacturing Process:");
        vehicle.manufacture();
        System.out.println("Car Manufacturing Process:");
        car.manufacture();
    }
}
