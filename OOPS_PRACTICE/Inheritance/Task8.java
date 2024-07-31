// Scenario 8: Vehicle Rental System
// Implement a vehicle rental system where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Each derived class can have its own rental rates and additional features specific to that type of vehicle.
class Vehicle {
    protected String brand;
    protected String model;
    protected double rentalPrice;

    public Vehicle(String brand, String model, double rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: " + rentalPrice);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, double rentalPrice, int numDoors) {
        super(brand, model, rentalPrice);
        this.numDoors = numDoors;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Num of Dools: "+numDoors);
    }
}

class Motorcycle extends Vehicle{
    private String 
}

public class Task8 {

}
