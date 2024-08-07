// Scenario 1: Math Constants
// In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.
class MathConstants {

    public final double PI = 3.14;
    public final double E = 2.718;

}

public class Task1 {
    public static void main(String[] args) {
        MathConstants mathConstants = new MathConstants();

        System.out.println("The value of PI is: " + mathConstants.PI);
        System.out.println("The value od E is: " + mathConstants.E);
    }
}
