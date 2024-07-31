// 3. Geometry Calculator: Create a class for calculating geometric shapes. Implement an instance initializer block to define default values for shape properties.

class Geometry {
    private double pi;
    private double value;
    {
        pi = 3.14;
        value = 2;
    }

    public double areaOfCircle(double redius) {
        return pi * Math.pow(redius, value);
    }

    public double perimeterOfRectangle(double length, double breadth) {
        return value * (length + breadth);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Geometry g1 = new Geometry();
        System.out.println("Area of Circle: " + g1.areaOfCircle(2));
        System.out.println("Perimeter Of Rectangle: " + g1.perimeterOfRectangle(10, 10));
    }
}

