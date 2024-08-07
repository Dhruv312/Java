// 5. User Authentication:
//    Build a secure authentication system using hashed passwords in Java, where users' passwords are stored as hashes and compared during login verification.
// - Input: Username: "user123", Password: "Password@123"
// - Expected Output: Hashed password stored securely; successful login using the correct credentials.

public class Task5 {
    public static void main(String[] args) {
        String username = "user123";
        String password = "Password@123";

        String hashedPassword = hashPassword(password);
        System.out.println("Stored Hashed Password: " + hashedPassword);

        boolean loginSuccess = verifyPassword(password, hashedPassword);
        System.out.println("Login Successful: " + loginSuccess);
    }

    public static String hashPassword(String password) {
        String hash = "";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            int asciiValue = (int) c;
            String hexValue = Integer.toHexString(asciiValue);
            hash += hexValue;
        }

        return hash;
    }

    public static boolean verifyPassword(String password, String storedHash) {
        String hashedPassword = hashPassword(password);

        return hashedPassword.equals(storedHash);
    }
}
