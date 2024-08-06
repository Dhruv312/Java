// Scenario 3: Database Connectivity
// Create an interface called "DatabaseConnection" with methods like "connect" and "disconnect." Implement classes like "MySQLConnection" and "PostgreSQLConnection" that provide specific implementations for these interface methods.

interface DatabaseConnection{
    void connect();
    void disconnect();
}

class MySQLConnection implements DatabaseConnection{

    @Override
    public void connect(){
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnecting to MySQL database...");
    }
}

class PostgreSQLConnection implements DatabaseConnection{

    @Override
    public void connect(){
        System.out.println("Connecting to PostgreSQL database...");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnecting to PostgreSQL database...");
    }

}
public class Task3 {
    public static void main(String[] args) {
        DatabaseConnection mySQLConnection = new MySQLConnection();
        DatabaseConnection postgrConnection = new PostgreSQLConnection();

        mySQLConnection.connect();
        mySQLConnection.disconnect();

        postgrConnection.connect();
        postgrConnection.disconnect();
    }
}
