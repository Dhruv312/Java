// 8. Overloading Constructors in Multilevel Inheritance:
//    - Problem Statement: Design a multilevel inheritance structure with classes 'Gadget', 'Phone', and 'Smartphone'. Each class should have multiple constructors to initialize different sets of attributes. Ensure constructor overloading and chaining using 'this' and 'super' keywords.

class Gadget{
    protected String brand;
    protected double price;

    public Gadget(String brand,double pricr){
        this.brand=brand;
        this.price=pricr;
    }

    public void showInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Pricr: "+price);
    }
}

class Phone extends Gadget{
    protected String model;

    public Phone(String brand,double price,String model){
        super(brand,price);
        this.model=model;
    }

    public void showPhoneInfo(){
        super.showInfo();
        System.out.println("Model: "+model);
    }
}

class Smartphone extends Phone{
    private String os;

    public Smartphone(String brand,double price,String model,String os){
        super(brand, price, model);
        this.os=os;
    }

    public void showSmartPhoneInfo(){
        super.showPhoneInfo();
        System.out.println("Operting System: "+os);
    }
}
public class  Task8{
    public static void main(String[] args){
        Phone p1=new Phone("Samsung",350,"s24");
        System.out.println("Phone Info: ");
        p1.showPhoneInfo();
        Smartphone s1=new Smartphone("Samsung",300,"s23","TIZEN");
        System.out.println("Smart Phone Info: ");
        s1.showSmartPhoneInfo();

    }
}