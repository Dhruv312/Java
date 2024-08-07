// 3. Exception Handling in a Calculator: Design a calculator program in Java that employs the 'throw' statement to manage arithmetic exceptions. Create situations where 'throw' is used to handle divide-by-zero errors or invalid mathematical operations.
import java.util.Scanner;
 class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

 class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}

class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double performOperation(double a, double b, int operation) throws InvalidOperationException, DivideByZeroException {
        switch (operation) {
            case 1:
                return add(a, b);
            case 2:
                return subtract(a, b);
            case 3:
                return multiply(a, b);
            case 4:
                return divide(a, b);
            default:
                throw new InvalidOperationException("Invalid operation: " + operation);
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("1.add\n2.subtract\n3.multiply\n4divide\nEnter operation num: ");
            int operation = scanner.nextInt();

            double result = calculator.performOperation(num1, num2, operation);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidOperationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
