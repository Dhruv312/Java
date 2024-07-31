// Scenario 2: University Department Management
// Create a university department management system where a department consists of multiple faculty members. The department class contains a list of faculty objects, representing an aggregation relationship.
class Faculty {
    private String name;
    private int id;
    private String subject;
    private double salary;

    public Faculty(int id, String name, String subject, double salary) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Department {
    private String departmentName;
    private Faculty faculty[];
    private int counter;

    public Department(int capacity, String departmentName) {
        this.counter = 0;
        this.departmentName = departmentName;
        this.faculty = new Faculty[capacity];
    }

    public void addFaculty(Faculty faculty1) {
        if (counter < faculty.length) {
            faculty[counter] = faculty1;
            counter++;
        } else {
            System.out.println("can not add more faculty");
        }
    }

    public void removeFaculty(int id) {
        for (int i = 0; i < counter; i++) {
            if (faculty[i].getId() == id) {
                for (int j = i; j < counter - 1; j++) {
                    faculty[j] = faculty[j + 1];
                }
                counter--;
            }
        }
    }

    public Faculty findFaculty(int id) {
        for (int i = 0; i < counter; i++) {
            if (faculty[i].getId() == id) {
                System.out.println("ID: " + faculty[i].getId() + ", Name: " + faculty[i].getName() + ", subject: "
                        + faculty[i].getSubject() + ", Salary: " + faculty[i].getSalary());
                return faculty[i];
            }
        }
        return null;
    }

    public void updateFaculty(int id, String name, String subject, double salary) {
        Faculty facultyUpdate = findFaculty(id);
        if (facultyUpdate != null) {
            facultyUpdate.setName(name);
            facultyUpdate.setSubject(subject);
            facultyUpdate.setSalary(salary);
        }
    }

    public void displayInfo() {
        System.out.println("Department: " + departmentName);
        for (int i = 0; i < counter; i++) {
            System.out.println("ID: " + faculty[i].getId() + ", Name: " + faculty[i].getName() + ", subject: "
                    + faculty[i].getSubject() + ", Salary: " + faculty[i].getSalary());
        }
    }

}

public class Task2 {
    public static void main(String[] args) {

        Department department = new Department(10, "Coding Department");
        department.addFaculty(new Faculty(101, "Mohak Sir", "C,C++,JAVA", 20000));
        department.addFaculty(new Faculty(102, "Shrey Sir", "Advance JAVA", 50000));
        department.addFaculty(new Faculty(103, "Zafar Sir", "HTML , CSS ,JS", 50000));

        department.displayInfo();

        System.out.println("Remove after:");
        department.removeFaculty(101);
        department.displayInfo();

        System.out.println("Found Facutly:");
        department.findFaculty(102);

        System.out.println("Update after:");
        department.updateFaculty(103, "Shrey Sir", "Advance JAVA,Robotics", 100000);
        department.displayInfo();
    }
}
