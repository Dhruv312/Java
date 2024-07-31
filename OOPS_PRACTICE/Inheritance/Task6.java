// Scenario 6: Electronics Product Hierarchy
// Design an electronics product hierarchy with a base class called "Product" and derived classes like "Television," "Smartphone," and "Laptop." The base class can contain attributes like brand and price, while the derived classes can have specific features and functionalities.

class Product {
    protected String brand;
    protected double price;

    public Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class Television extends Product {
    private int screenSize;

    public Television(String name, double price, int screenSize) {
        super(name, price);
        this.screenSize = screenSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize);
    }
}

class SmartPhone extends Product {
    private int storageCapacity;
    private int ram;

    public SmartPhone(String brand, double price, int storageCapacity, int ram) {
        super(brand, price);
        this.storageCapacity = storageCapacity;
        this.ram = ram;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
        System.out.println("Ram: " + ram + "GB");
    }
}

class Laptop extends Product {
    private String processor;
    private int ram;
    private int storageCapacity;

    public Laptop(String brand, double price, String processor, int ram, int storageCapacity) {
        super(brand, price);
        this.processor = processor;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor: " + processor);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
        System.out.println("Ram: " + ram + "GB");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Television television = new Television("Samsung", 599.99, 55);
        SmartPhone smartPhone = new SmartPhone("Apple", 999.99, 256, 8);
        Laptop laptop = new Laptop("Dell", 1299.99, "Intel i7", 16, 512);
        
        System.out.println("Television Info:");
        television.displayInfo();
        System.out.println("\nSmart Phone Info:");
        smartPhone.displayInfo();
        System.out.println("\nLaptop Info:");
        laptop.displayInfo();
    }
}
