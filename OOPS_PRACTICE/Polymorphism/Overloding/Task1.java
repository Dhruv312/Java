// Method Overloading:
// Scenario 1: Calculator
// In a calculator application, implement method overloading for the addition operation. Create multiple methods with different parameter types such as adding two integers, adding two doubles, and adding three integers.

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a,double b){
        return a+b;
    }
    int add(int a, int b ,int c){
        return a+b+c;
    }
}
public class Task1{
    public static void main(String[] args){
        Calculator calculator=new Calculator();
        System.out.println("Adding two integers: "+calculator.add(10, 20));
        System.out.println("Adding two doubles: "+ calculator.add(25.0, 25.0));
        System.out.println("Adding three integers: "+calculator.add(10, 20, 30));
    }
}
