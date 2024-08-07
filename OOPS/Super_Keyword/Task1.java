/*
Problem Statement: Employee Information System

Create a system to manage employee information using Java classes and inheritance. Implement a `Person` class that stores basic personal details and an `Emp` class that extends the `Person` class to include salary information.

The `Person` class contains:
- Properties: `id` (integer), `name` (String)
- Constructor: Initializes `id` and `name`

The `Emp` class inherits from `Person` and adds:
- Property: `salary` (float)
- Constructor: Initializes `id`, `name`, and `salary`

Implement the `display()` method in the `Emp` class to print the employee's information: ID, name, and salary.

In the `TestSuper5` class:
- Create an instance of `Emp` with ID `1`, name `"ankit"`, and a salary of `45000`.
- Display the details of this employee using the `display()` method.
*/
class Person{
    protected String name;
    protected int id;

    public Person(String name, int id){
        this.name=name;
        this.id=id;
    }

}

class Employee extends Person{
    private double salary;

    public Employee(String name,int id,double salary){
        super(name, id);
        this.salary=salary;
    }

    public void display(){
        System.out.println("Name: "+name+" Id: "+id+" Salary: "+salary);
    }
}
public class Task1 {
    public static void main(String[] args){
        Employee e1=new Employee("ankit", 1, 45000);
        e1.display();
    }
}
