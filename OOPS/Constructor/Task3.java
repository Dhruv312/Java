// 3. Constructor Chaining:
//    Implement a 'Rectangle' class with fields for 'length' and 'width'. Provide a default constructor that initializes these to 1, another constructor that takes only 'length' (and sets 'width' to a default value), and a constructor that takes both 'length' and 'width'. Use constructor chaining to avoid code duplication.

class Rectangle{
    private  double length;
    private double width;

    public Rectangle(){
        length=1.0;
        width=1.0;
    }
    public Rectangle(double length){
        this.length=length;
    }
    public Rectangle(double length , double width){
        this.length=length;
        this.width=width;
    }
    void display(){
        System.out.println("Rectangke: "+(length*width));
    }

};
public class Task3 {
    public static void main(String[] arsg){
        Rectangle r1=new Rectangle();
        r1.display();

        Rectangle r2=new Rectangle(10);
        r2.display();
        
        Rectangle r3=new Rectangle(10,12);
        r3.display();
    }
}
