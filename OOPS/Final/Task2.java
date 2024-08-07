// Scenario 2: Configuration Settings
// In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

class Configuration{
    public final String URL ="https://github.com/himesh-royal/EveGen";

    public final String userName="Himesh";
    public final String password="himesh@022";

    public void display(){
        System.out.println("URL: "+URL);
        System.out.println("USERNAMR: "+userName);
        System.out.println("PASSWORD: "+password);
    }
}

public class Task2 {
    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.display();

    }
}
