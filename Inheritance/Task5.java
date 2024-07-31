// 5. Static Members in Multilevel Inheritance:
//    - Problem Statement: Create a multilevel inheritance structure with classes 'Company', 'Department', and 'Employee'. The 'Company' class should have a static attribute 'companyName' and a method 'showCompany()'. The 'Department' class should add 'departmentName', and the 'Employee' class should add 'employeeName' and 'employeeID'. Ensure proper initialization and use static members effectively.

class Company{
    public static String companyName;

    public static void showCompany(){
        System.out.println("Company Name: "+companyName);
    }
}

class Department extends Company{
    protected String departmentName;

    public Department(String departmentName){
        this.departmentName=departmentName;
    }
}

class Employee extends Department{
    private String employeeName;
    private int employeeId;

    public Employee (String departmentName,String employeeName,int employeeId){
        super(departmentName);
        this.employeeName=employeeName;
        this.employeeId=employeeId;
    }


    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Department Name: " +departmentName);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}
public class Task5 {
  public static void main(String[] args){
    Company.companyName=("It Company");
    Employee e1= new Employee("IT_PROG","Mr.Mohak",1);
    e1.displayInfo();
  }  
}
