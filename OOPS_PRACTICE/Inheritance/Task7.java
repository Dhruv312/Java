// Scenario 7: University Staff Hierarchy
// Develop a university staff hierarchy with a base class called "Staff" and derived classes like "Professor," "AdminStaff," and "TechnicalStaff." The base class can include attributes like name and salary, while the derived classes can have additional attributes based on their roles.

class Staff {
    protected String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Professor extends Staff {
    private String researchArea;
    private String department;

    public Professor(String name, double salary, String researchArea, String department) {
        super(name, salary);
        this.researchArea = researchArea;
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
        System.out.println("Department: " + department);
    }
}

class AdminStaff extends Staff {
    private String role;
    private String department;

    public AdminStaff(String name, double salary, String role, String department) {
        super(name, salary);
        this.department = department;
        this.role = role;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
        System.out.println("Department: " + department);
    }

}

class TechnicalStaff extends Staff {
    private String skillSet;
    private String shift;

    public TechnicalStaff(String name, double salary, String skillset, String shift) {
        super(name, salary);
        this.skillSet = skillset;
        this.shift = shift;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Skill Set: " + skillSet);
        System.out.println("Shift: " + shift);
    }
}

public class Task7 {
    public static void main(String[] args) {
        Professor professor =new Professor("Dr. Smith", 90000, "Computer Science", "Artificial Intelligence");
        AdminStaff adminStaff=new AdminStaff("Ramesh Patel", 50000, "Registrar", "Admissions");
        TechnicalStaff technicalStaff= new TechnicalStaff("Chirag Patel", 40000, "Lab Technician", "Night");

        System.out.println("Professor Info:");
        professor.displayInfo();
        System.out.println("\nAdmin Staff Info:");
        adminStaff.displayInfo();
        System.out.println("\nTechnical Staff Info:");
        technicalStaff.displayInfo();

    }
}
