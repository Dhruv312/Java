// Scenario 2: Vehicle Service Center
// In a vehicle service center application, create classes like "Vehicle," "Car," and "Motorcycle" representing different types of vehicles. Use the instanceof operator to identify the type of vehicle and perform specific service operations based on the vehicle's type.

class Vehicle{
    protected String make;
    protected String model;

    public Vehicle(String make , String model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
    public void service(){
        System.out.println("Service vehicle: "+make+" "+model);
    }
}


class Car extends Vehicle{
    public Car(String make ,String model){
        super(make, model);
    }

    @Override
    public void service(){
        System.out.println("Service car: "+make+" "+model);
        System.out.println("Car service completed.");
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(String make ,String model){
        super(make, model);
    }

    @Override
    public void service(){
        System.out.println("Service motocycle: "+make+" "+model);
        System.out.println("Motorcycle service completed.");
    }
}
public class Task2 {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle("Normal", "Model");
        Vehicle car = new Car("Toyota", "camry");
        Vehicle motorcycle = new Motorcycle(" Yamaha", "YZ450F");

        if (vehicle instanceof Vehicle) {
            vehicle.service();
        }if(car instanceof Car){
            car.service();
        }if(motorcycle instanceof Motorcycle){
            motorcycle.service();
        }
    }
}
