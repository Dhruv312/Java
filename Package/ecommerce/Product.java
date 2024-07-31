// Scenario 2: E-commerce Platform
// Design a package called "ecommerce" that includes classes like "Product," "Cart," and "Order" that are related to online shopping. Place these classes in the "ecommerce" package to encapsulate and manage them as a cohesive unit.

package ecommerce;

class Product{
    protected String name;
    protected double price;

    public Product(String name , double price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getNane(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public void displayDetails(){
             System.out.println("Product Name: "+name);
        System.out.println("Price: "+price);
    } 
}