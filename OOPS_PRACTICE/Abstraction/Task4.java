// Scenario 4: Shape Calculation
// Create an abstract class called "Shape" with abstract methods like "calculateArea" and "calculatePerimeter." Implement derived classes like "Circle" and "Rectangle" that provide specific implementations for these abstract methods.

abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double calculateArea(){
        return 3.14*radius*radius;
    }

    public double calculatePerimeter(){
        return 2*3.14*radius;
    }

}

class Rectangle extends Shape{
    private double l;
    private double b;

    public Rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }

    public double calculateArea(){
        return l*b;
    }

    public double calculatePerimeter(){
        return 2*(l+b);
    }

}
public class Task4 {
    public static void main(String[] args){
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 10);
        
        System.out.println("Area of Circle: "+circle.calculateArea());
        System.out.println("Perimeter of Circle: "+circle.calculatePerimeter());

        // rectangle.calculateArea();
        // rectangle.calculatePerimeter();
    }   
}
