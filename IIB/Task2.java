// 2. Math Operations: Develop a class that performs mathematical operations (addition, subtraction, etc.). Initialize required constants and variables within an instance initializer block.

class MathOperation {
    private double addition;
    private double subtraction;
    private double multiplication;
    private double division;

    {
        addition = 0;
        subtraction = 0;
        multiplication = 1;
        division = 1;
    }

    public double addition(double a, double b) {
        return a + b + addition;
    }

    public double subtraction(double a, double b) {
        return a - b - subtraction;
    }

    public double multiplication(double a, double b) {
        return a * b * multiplication;
    }

    public double division(double a, double b) {
        return a / b / division;
    }

}

public class Task2 {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        System.out.println("4 + 6: " + operation.addition(4, 6));
        System.out.println("10 - 5: " + operation.subtraction(10, 5));
        System.out.println("23 * 4: " + operation.multiplication(23, 4));
        System.out.println("12 / 3: " + operation.division(12, 3));
    }
}
