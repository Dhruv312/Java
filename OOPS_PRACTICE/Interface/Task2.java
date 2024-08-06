// Scenario 2: Messaging Service Integration
// Develop an interface called "MessagingService" with methods like "sendMessage" and "receiveMessage." Implement classes like "EmailService" and "SMSService" that provide specific implementations for these interface methods.

interface MessagingService {
    void sendMessage(String receiver, String message);
    void receiveMessage(); 
}

class EmailService implements MessagingService {

    @Override
    public void sendMessage(String receiver, String message) {
        System.out.println("Sending email to " + receiver + ": " + message);
    }

    @Override
    public void receiveMessage() { 
        System.out.println("Received email message");
    }

}

class SMSService implements MessagingService {

    @Override
    public void sendMessage(String receiver, String message) {
        System.out.println("Sending SMS to " + receiver + ": " + message);
    }

    @Override
    public void receiveMessage() {  
        System.out.println("Received SMS message");
    }

}

public class Task2 {
    public static void main(String[] args) {
        MessagingService emailService = new EmailService();
        MessagingService smsService = new SMSService();

        emailService.receiveMessage(); 
        emailService.sendMessage("himesh124@gmail.com", "Hello Himesh Patel");
        smsService.receiveMessage(); 
        smsService.sendMessage("himesh124@gmail.com", "Hello Himesh Patel");
    
    }
}

