// Scenario 4: Shape Hierarchy
// Develop a shape hierarchy with a base class called "Shape" and derived classes like "Circle," "Rectangle," and "Triangle." The base class can define common attributes like color and area calculation methods, while the derived classes can implement shape-specific behavior.

class Shape{
    public double area(){
        return 0.0;
    }
}

class Circle extends Shape{
    private double redius;
    
    public Circle(double redius){
        this.redius = redius;
    }

    public double area(){
        return 3.14*redius*redius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;
    }    
}

class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base , double height){
        this.base=base;
        this.height=height;
    }

    public double area(){
        return (base*height)/2;
    } 
}
public class Task4 {
    public static void main(String[] args){
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 12);
        Triangle triangle = new Triangle(20, 25);
        System.out.println("Area of Circle: "+circle.area());
        System.out.println("Area of Rectangle: "+rectangle.area());
        System.out.println("Area of Triangle: "+triangle.area());
    }
}
