
class Shape {
    void transform() {
        System.out.println("Transforming a Shape");
    }
}

class Circle extends Shape {
    @Override
    void transform() {
        System.out.println("Transforming a Circle: Scaling radius");
    }
}

class Rectangle extends Shape {
    @Override
    void transform() {
        System.out.println("Transforming a Rectangle: Scaling width and height");
    }
}

class Triangle extends Shape {
    @Override
    void transform() {
        System.out.println("Transforming a Triangle: Scaling base and height");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        shape.transform();
        circle.transform();
        rectangle.transform();
        triangle.transform();
    }
}
