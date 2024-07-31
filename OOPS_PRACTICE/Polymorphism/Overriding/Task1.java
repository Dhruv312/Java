// Scenario 1: Shape Drawing Application
// In a shape drawing application, create a base class called "Shape" with a method called "draw." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "draw" method to display the respective shapes.

class Shape{
    public void draw(){
        System.out.println("Drawing a Shape.");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle.");
    }
}

class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Triangle.");
    }
}

public class Task1 {
    public static void main(String[] args){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
