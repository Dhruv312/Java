// Method Overloading:
// Scenario 2: Messaging App
// In a messaging application, implement method overloading for sending messages. Create different methods with different parameter combinations, such as sending a text message, sending an image message, and sending a video message.
class MessagingApp{
    public void sendMessag(String text){
        System.out.println("sending a text message is "+text);
    }

    public void sendMessag(int size){
        System.out.println("sending an image size "+size);
    }
    public void sendMessag(double size){
        System.out.println("sending a video size is "+size+"MB");
    }
      
}

public class Task2 {
    public static void main(String[] args){
        MessagingApp messagingApp=new MessagingApp();
        messagingApp.sendMessag("Hello world");
        messagingApp.sendMessag(10);
        messagingApp.sendMessag(10.0);
    }
}
