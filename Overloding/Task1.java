// 1. Problem: Create a class called `Calculator` that demonstrates method overloading for basic arithmetic operations (addition, subtraction, multiplication, and division).
//    - Example: Implement the `add`, `subtract`, `multiply`, and `divide` methods in the `Calculator` class, each overloaded with different parameter lists to perform the respective operations.
class Calculator{
  public void  add(int a,int b){
    System.out.println("Addition of a and b:"+(a+b));
  }
  public void  add(float a,float b){
    System.out.println("Addition of a and b:"+(a+b));
  }
  public void  add(int a,int b,int c){
    System.out.println("Addition of a and b:"+(a+b+c));
  }
  public void  subtract(int a,int b){
    System.out.println("Subtract of a and b:"+(a-b));
  }
  public void subtract(float a,float b){
    System.out.println("Subtract of a and b:"+(a-b));
  }
  

  public void  multiply(int a,int b){
    System.out.println("Multiplication of a and b:"+(a*b));
  }
  public void  multiply(double a,double b){
    System.out.println("Multiplication of a and b:"+(a*b));
  }

  public void  divide(int a,int b){
    System.out.println("Division of a and b:"+(a/b));
  }
  public void  divide(double a,double b){
    System.out.println("Division of a and b:"+(a/b));
  }
  
}
public class Task1 {
    public static void main(String[] args){
        Calculator c1=new Calculator();
        c1.add(1, 10);
        c1.add(11.1f, 50.9f);
        c1.add(20, 20,20);

        c1.subtract(40, 10);
        c1.subtract(67.23f, 50.30f);

        c1.multiply(20, 80);
        c1.multiply(3.3, 7.2);

        c1.divide(20, 4);
        c1.divide(20.1, 5.3);
    }
}
