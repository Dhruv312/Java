// Scenario 3: Math Calculations
// In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.
class MathUtils {
    public static final double sqrt(double value) {
        return Math.sqrt(value);
    }

    public static final double log(double value) {
        return Math.log(value);
    }

    public static final double log10(double value) {
        return Math.log10(value);
    }
}

public class Taskk3 {
    public static void main(String[] args){
        System.out.println("Squar root: "+MathUtils.sqrt(3));
        System.out.println("logarithm:: "+MathUtils.log(10));
        System.out.println("10 logarithm: "+MathUtils.log10(3));
    }
}
