// Scenario 3: Employee Payroll System
// Develop an employee payroll system where an organization has multiple employees. The organization class contains a list of employee objects, representing an aggregation relationship.
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
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

class Organization {
    Employee employee[];
    int counter;

    public Organization(int capacity) {
        this.counter = 0;
        this.employee = new Employee[capacity];
    }

    public void addEmployee(Employee employee1) {
        if (counter < employee.length) {
            employee[counter] = employee1;
            counter++;
        } else {
            System.out.println("can not add more employees");
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < counter; i++) {
            if (employee[i].getId() == id) {
                for (int j = i; j < counter - 1; j++) {
                    employee[j] = employee[j + 1];
                }
                counter--;
            }
        }
    }

    public Employee findEmployee(int id) {
        for (int i = 0; i < counter; i++) {
            if (employee[i].getId() == id) {
                System.out.println("ID: " + employee[i].getId() + ", Name: " + employee[i].getName() + ", Salary: "
                        + employee[i].getSalary());
                return employee[i];
            }
        }
        return null;
    }

    public void updateEmployee(int id, String name, double salary) {
        Employee employeeUpdate = findEmployee(id);
        if (employeeUpdate != null) {
            employeeUpdate.setName(name);
            employeeUpdate.setSalary(salary);
        }
    }

    public void displayInfo() {
        for (int i = 0; i < counter; i++) {
            System.out.println("ID: " + employee[i].getId() + ", Name: " + employee[i].getName() + ", Salary: "
                    + employee[i].getSalary());
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Organization organization = new Organization(10);
        organization.addEmployee(new Employee("Rajesh", 101, 10000));
        organization.addEmployee(new Employee("Manoj", 102, 12000));
        organization.addEmployee(new Employee("Kanak", 103, 9000));

        organization.displayInfo();
        System.out.println("Remove after:");
        organization.removeEmployee(101);
        organization.displayInfo();

        System.out.println("Found Employee:");
        organization.findEmployee(102);

        System.out.println("Update after:");
        organization.updateEmployee(103,"Jay",12000);
        organization.displayInfo();
    }
}
