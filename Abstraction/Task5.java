// Scenario 5: Employee Management
// Design an abstract class called "Employee" with abstract methods like "calculateSalary" and "displayDetails." Implement derived classes like "Manager" and "Engineer" that provide specific implementations for these abstract methods.

abstract class Employee{
    String name;
    double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee{
    double bouns;

    public Manager(String name,double salary,double bouns){
        super(name, salary);
        this.bouns=bouns;
    }

    double calculateSalary(){
        return salary+bouns;
    }
    void displayDetails(){
        System.out.println("Manager Info: ");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+calculateSalary());
    }
}
class Engineer extends Employee{
    double overtime;

    public Engineer(String name,double salary,double overtime){
        super(name, salary);
        this.overtime=overtime;
    }

    double calculateSalary(){
        return salary*overtime;
    }
    void displayDetails(){
        System.out.println("Engineer Info:");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+calculateSalary());
    }
}

public class Task5{
    public static void main(String[] args) {
        Manager manager=new Manager("Himesh", 10000.0, 1000);
        Engineer engineer =new Engineer("Meet", 20000, 4);
        manager.calculateSalary();
        manager.displayDetails();
    }
}
