// 6. String Manipulation:
//    Create a Java program that takes a user's input and formats it into a readable sentence, ensuring proper capitalization and removing leading/trailing spaces.
// - Input: "   hello, world!   "
// - Expected Output: "Hello, world!" (formatted sentence with proper capitalization and no leading/trailing spaces)

public class Task6 {
    public static void main(String[] args) {
        String input = "   hello, world!   ";
        String format = input.trim();
        String format1 = format.substring(0,1).toUpperCase();
        String format2 = format.substring(1);

        System.out.println("Format String: "+format1+format2);
    }
}
