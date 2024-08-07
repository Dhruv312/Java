// 4. Constructor Chaining with Single Inheritance:
//    - Problem Statement: Design a single inheritance relationship with classes 'Appliance' and 'WashingMachine'. The 'Appliance' class should have attributes 'power' and 'brand', and a constructor to initialize these attributes. The 'WashingMachine' class should add 'capacity' and utilize constructor chaining to initialize all attributes using 'this' and 'super'.
class  Appliance{
    protected int power;
    protected String brand;

    public Appliance(int power,String brand){
        this.power=power;
        this.brand=brand;
    }

    public void displayInfo(){
        System.out.println("Appliance Brand : "+brand+"\nAppliance Power: "+power+"w");
    }
}

class WashingMachine extends Appliance{
    private int  capacity;

    public WashingMachine(int power,String brand, int capacity){
        super(power, brand);
        this.capacity=capacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Washing Machine Capacity: "+capacity+"Kg");
    }
}
public class Task4 {
    public static void main(String[] args){
        WashingMachine w1=new WashingMachine(1000, "Lg", 8);
        w1.displayInfo();
    }
}
