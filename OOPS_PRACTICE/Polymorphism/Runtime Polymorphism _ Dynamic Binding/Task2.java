// Scenario 2: Shape Drawing Application
// In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.

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

public class Task2 {
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
