// 1. Area Calculation:
//    Write a class `Shape` with overloaded methods `area()` to calculate the area of a circle (using radius), a rectangle (using length and breadth), and a triangle (using base and height).
class Shape{
    public double area(double redius){
      return 3.14*redius*redius;
    }

    public double area(int length ,int breadth){
        return length *breadth;
    }
    public double area(double base,double height){
        return (base*height)/2;
    }
}

public class Task2{
    public static void main(String[] args){
        Shape s1=new Shape();
        System.out.println("Area of Circle: "+s1.area(10));
        System.out.println("Area of Rectangle: "+s1.area(10, 20));
        System.out.println("Area of Triangle: "+s1.area(20.4, 30.4));
    }
}

