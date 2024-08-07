// Scenario 5: Customer Relationship Management (CRM) System
// In a CRM system, encapsulate the customer data and methods for managing customer interactions to ensure data integrity, privacy, and controlled access to customer information.

class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer(String name, String email, String phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Information:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

class CRMSystem {
    
    private Customer[] customers;
    private int customerCount;
    
    public CRMSystem(int maxCustomers) {
        this.customers = new Customer[maxCustomers];
        this.customerCount = 0;
    }

    public void addCustomer(Customer customer) {
        if (customerCount < customers.length) {
            customers[customerCount] = customer;
            customerCount++;
            System.out.println("Customer added successfully.");
        } else {
            System.out.println("Cannot add more customers. CRM system is full.");
        }
    }
    
    public void displayAllCustomers() {
        System.out.println("Customer List:");
        for (int i = 0; i < customerCount; i++) {
            customers[i].displayCustomerInfo();
            System.out.println();
        }
    }
}


public class Task5 {
    public static void main(String[] args) {
        
        CRMSystem crm = new CRMSystem(10);
        
        Customer customer1 = new Customer("Ajay Patel", "ajaypatel@gmail.com", "123-456-7890", "Gujrat");
        Customer customer2 = new Customer("Raj Shah", "rahshah@gmail.com", "987-654-3210", "Mumbai");
        crm.addCustomer(customer1);
        crm.addCustomer(customer2);

        crm.displayAllCustomers();
    }
}
