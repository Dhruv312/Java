// Scenario 1: Car Manufacturing
// In a car manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

class Vehicle {
    void manufacture() {
        System.out.println("Step 1: Building the vehicle frame");
        System.out.println("Step 2: Installing the engine");
        System.out.println("Step 3: Painting the vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void manufacture() {
        super.manufacture();
        System.out.println("Step 4: Installing car-specific interior features");
        System.out.println("Step 5: Adding car-specific electronics");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();

        System.out.println("Car Manufacturing Process:");
        myCar.manufacture();
    }
}
