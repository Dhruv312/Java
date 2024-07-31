// Scenario 3: E-commerce Product Search
// In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.

class Product{
    protected String name;
    protected double price;

    public Product(String name,double price){
        this.name=name;
        this.price=price;
    } 
    public Product search(String product){
        return null;
    }
    public String toString(){
        return "Product{Name:"+name+" ,Price:"+price+"}";
    }
}

class ElectronicsProduct extends Product{
    private String brand;
    private String model;

    public ElectronicsProduct(String name,double price,String brand,String model){
        super(name, price);
        this.brand=brand;
        this.model=model;
    }

    public ElectronicsProduct search(String product){
        if(product.equals("electronics")){
            return new ElectronicsProduct(this.name,this.price,this.brand,this.model);
        }
        return null;
    }

    public String toString(){
        return "ElectronicsProduct{Name: "+name+" ,Price: "+price+" ,Brand: "+brand+" ,Model: "+model+"}";
    }
}

class ClothingProduct extends Product{
    private String color;

    public ClothingProduct(String name,double price,String color){
        super(name, price);
        this.color=color;
    }

    public ClothingProduct search(String product){
        if(product.equals("clothing")){
            return new ClothingProduct(this.name,this.price,this.color);
        }
        return null;
    }

    public String toString(){
        return "ClothigProduct{Name: "+name+" ,Price: "+price+" ,Color: "+color+"}";
    }


}
public class Task3 {
    public static void main(String[] args){
        ElectronicsProduct e=new  ElectronicsProduct("SmartPhone", 60000, "Samsung", "J6");
        ClothingProduct c=new ClothingProduct("T-shirt", 200, "Red");
        System.out.println(e.search("electronics"));
        System.out.println(c.search("clothing"));
    }
}
