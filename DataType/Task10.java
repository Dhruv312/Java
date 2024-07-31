import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        int number = scanner.nextInt();

        
        System.out.print("Expected Output: ");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10; 
        }
    }
}







