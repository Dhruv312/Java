// 6. Using Super to Call Parent Class Methods:
//    - Problem Statement: Implement a hierarchical inheritance system with classes 'Shape', 'Circle', and 'Rectangle'. The 'Shape' class should have a method 'area()'. Both 'Circle' and 'Rectangle' classes should override the 'area()' method. Ensure 'Circle' and 'Rectangle' call the 'area()' method from 'Shape' using 'super' and then add their specific calculations.

class Shape{
    public void area(){ 
        System.out.println("Area calculation");
    }
} 

class Circle extends Shape{
    private double redius;

    public Circle(double redius){
        this.redius=redius;
    }

    public void area(){
        System.out.println("Area of Circle: "+(3.14*redius*redius));
    }
}

class Rectangle extends Shape{
    private double l,w;

    public Rectangle(double l,double w){
        this.l=l;
        this.w=w;
    }

    public void area(){
        System.out.println("Area of Rectangle: "+(l*w));
    }
}

public class Task6 {
 public static void main(String[] args){
    Circle c1= new Circle(10);
    c1.area();
    Rectangle r1= new Rectangle(10,20);
    r1.area();
 }   
}
