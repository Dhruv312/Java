import java.util.Scanner;
class Employee{
    private String name;
    private double salary;
    private int id;

    void scannerDate(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Id: ");
        id=sc.nextInt();
        System.out.print("Enter Salary: ");
        salary=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter name: ");
        name=sc.nextLine();
    }

    void printDate(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }
};

public class Task1 {
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.scannerDate();
        e1.printDate();
    }
}