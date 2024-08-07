// Scenario 1: Vehicle Manufacturing
// In a vehicle manufacturing system, encapsulate the internal details of a "Car" class, such as engine specifications and manufacturing processes, to protect sensitive information and provide a controlled interface for interacting with the car.

class Car {
    private String model;
    private int year;
    private double rentalPrice;

    public Car(String model, int year, double rentalPrice) {
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 1885 && year <= 2024) {
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        if(rentalPrice > 0) {
            this.rentalPrice = rentalPrice;
        } else {
            System.out.println("Invalid rental price.");
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car("Honda Civic", 2002, 2000);

        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Rental Price: Rs." + myCar.getRentalPrice());

        myCar.setModel("Honda Accord");
        myCar.setYear(2022);
        myCar.setRentalPrice(3000);

        System.out.println("Updated Model: " + myCar.getModel());
        System.out.println("Updated Year: " + myCar.getYear());
        System.out.println("Updated Rental Price: Rs." + myCar.getRentalPrice());


        myCar.setYear(1800);
        myCar.setRentalPrice(-5);
    }
}
