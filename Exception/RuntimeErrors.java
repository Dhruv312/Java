public class RuntimeErrors {
    public static void main(String[] args) {
        System.out.println("Before Exception");

        // System.out.println(2/0);
        // String str = null;
        // System.out.println(str.length());

        /*
        try {
            // System.out.println(2/0);
            // System.out.println(str.length());
            Class.forName("java.utils.Scanner");
        } catch(ArithmeticException | ClassNotFoundException e) {
            // System.out.println(e);
            // System.out.println(e.getMessage());
            e.printStackTrace();
            // System.out.println("bhai / by zero nai chale");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        */

        try {
            System.out.println(2/0);
            // System.out.println(str.length());
            // Class.forName("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        

        System.out.println("After Exception");
    }
}
