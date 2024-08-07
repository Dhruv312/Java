// 2. Input Validation in a User Registration System: Write a Java program for a user registration system where the 'throw' keyword is employed to manage input validation errors. For instance, use 'throw' to handle cases like invalid email formats or missing required fields during user registration.

import java.util.Scanner;
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class MissingFieldException extends Exception {
    public MissingFieldException(String message) {
        super(message);
    }
}

class UserRegistration {

    public void registerUser(String username, String email, String password) 
        throws InvalidEmailException, MissingFieldException {

        if (username == null || username.trim().isEmpty()) {
            throw new MissingFieldException("Username is required.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new MissingFieldException("Email is required.");
        }
        if (password == null || password.trim().isEmpty()) {
            throw new MissingFieldException("Password is required.");
        }
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Invalid email format.");
        }
        
        System.out.println("User registered successfully!");
    }

    private boolean isValidEmail(String email) {
        int index1 = email.indexOf('@');
        int index2 = email.lastIndexOf('.');

        return index1 > 0 && index2 > index1 + 1 && index2 < email.length() - 1;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration registration = new UserRegistration();
        
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            registration.registerUser(username, email, password);
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MissingFieldException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
