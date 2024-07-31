// Scenario 8: Mobile Application Development
// Design an abstract class called "App" with abstract methods like "open" and "close." Implement derived classes like "ChatApp" and "PhotoEditingApp" that provide specific implementations for these abstract methods.

abstract class App{
    abstract void open();
    abstract void close();
}

class ChatApp extends App{

    @Override
    public void open(){
        System.out.println("Opning ChatApp....");
    }

    @Override
    public void close(){
        System.out.println("Closing ChatApp....");
    }

}

class PhotoEditingApp extends App{

    @Override
    public void open(){
        System.out.println("Opning PhotoEditingApp....");
    }

    @Override
    public void close(){
        System.out.println("Closing PhotoEditingApp....");
    }
}

public class Task8 {
    public static void main(String[] args) {
        ChatApp chatApp = new ChatApp();
        PhotoEditingApp photoEditingApp = new PhotoEditingApp();

        chatApp.open();
        chatApp.close();

        photoEditingApp.open();
        photoEditingApp.close();
        
    }
}
