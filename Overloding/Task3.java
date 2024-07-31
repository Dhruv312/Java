// 2. Volume Calculation:
//    Create a class `Volume` with overloaded methods `calculate()` to compute the volume of a cube (using side length), a cylinder (using radius and height), and a rectangular prism (using length, width, and height)
class Volume{
    public double calculate(double side){
        return Math.pow(side, 3);
    }
    public double calculate(double redius,double height){
        return 3.14*Math.pow(redius, 2)*height;
    }
    public double calculate(double length,double width,double height){
        return width*height*length;
    }
}
public class Task3 {
    public static void main(String[] args){
        Volume v1=new Volume();
        System.out.println("Volume of a cube: "+v1.calculate(10));
        System.out.println("Volume of a Cylinder: "+v1.calculate(10,20));
        System.out.println("Volume of a cube: "+v1.calculate(15,25,35));
    } 
}
