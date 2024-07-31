// Scenario 2: Employee Hierarchy
// Create an employee hierarchy with a base class called "Employee" and derived classes like "Manager," "Engineer," and "Intern." The base class can contain attributes like name and employee ID, while the derived classes can have additional attributes specific to their roles.
class Employee{
    protected String name;
    protected int id;

    public Employee(String name , int id){
        this.name=name;
        this.id=id;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name,int id, String department){
        super(name, id);
        this.department=department;
    }

    public void display(){
        System.out.println("Manger Infomation:");
        super.display();
        System.out.println("Department: "+department);
        System.out.println();
    }
}

class Engineer extends Employee{
    private String  expertise;

    public Engineer(String name, int id, String expertise){
        super(name, id);
        this.expertise=expertise;
    }

    public void display(){
        System.out.println("Engineer Infomation:");
        super.display();
        System.out.println("Expertise: "+expertise);
        System.out.println();
    }

}
class Intern extends Employee{
    private String school;

    public Intern(String name, int id, String school){
        super(name, id);
        this.school=school;
    }

    public void display(){
        System.out.println("Intern Infomation:");
        super.display();
        System.out.println("School: "+school);
        System.out.println();
    }
}
public class Task2 {
    public static void main(String[] args){
        Manager manager = new Manager("Himesh", 1002, "Engineer");
        Engineer engineer = new Engineer("Meet", 2001, "Software Engineer");
        Intern intern = new Intern("Mohak", 1020, "MIT");
        manager.display();
        engineer.display();
        intern.display();
    }
}
