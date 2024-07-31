// Scenario 2: Shape Factory
// In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method and return their specific shape objects.

class Shape {
    Shape createShape() {
        return new Shape();
    }
}

class Circle extends Shape {
    @Override
    Circle createShape() {
        System.out.println("Creating a Circle");
        return new Circle();
    }
}

class Rectangle extends Shape {
    @Override
    Rectangle createShape() {
        System.out.println("Creating a Rectangle");
        return new Rectangle();
    }
}

public class Task2 {
    public static void main(String[] args) {
        Shape circleFactory = new Circle();
        Shape rectangleFactory = new Rectangle();

        Circle circle = (Circle) circleFactory.createShape();
        Rectangle rectangle = (Rectangle) rectangleFactory.createShape();
    }
}

// class Shape {
//     public Shape createShape() {
//         System.out.println("shape");
//         return this;
//     }

//     // @Override
//     // public String toString() {
//     //     return "Shape";
//     // }
// }

// class Circle extends Shape {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     public Circle createShape() {
//         System.out.println("Circle with radius: " + this.radius);
//         return new Circle(this.radius);
//     }

// }

// class Rectangle extends Shape {
//     private double width;
//     private double height;

//     public Rectangle(double width, double height) {
//         this.height = height;
//         this.width = width;
//     }

//     @Override
//     public Rectangle createShape() {
//         System.out.println( "Rectangle with width: " + this.width + " and height: " + this.height);
//         return new Rectangle(this.width, this.height);
//     }
// }

// public class Task2 {
//     public static void main(String[] args) {
//         Circle circle = new Circle(10);
//         Rectangle rectangle = new Rectangle(10, 20);
//         System.out.println("Created " + circle.createShape());
//         System.out.println("Created " + rectangle.createShape());
//     }
// }

