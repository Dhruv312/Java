// Scenario 4: Contact Management
// In a contact management application, create an array to store contact information such as names, phone numbers, and email addresses. Implement features such as adding new contacts, searching for a specific contact, and deleting contacts from the array.

public class ContactManagement {
    private static final int MAX_CONTACT=100;
    private Contact []contact;
    private int contactCount;

    private ContactManagement(){
        contact=new Contact[MAX_CONTACT];
        contactCount=0;
    }

    class Contact{
        String name;
        String email;
        String num;

        public Contact(String name, String email, String num){
            this.name=name;
            this.email=email;
            this.num=num;
        }
        public String getName() {
            return name;
        }
    
        public String getPhoneNumber() {
            return num;
        }
    
        public String getEmail() {
            return email;
        }
    }

    public void addContact(String name, String email, String num){
        if (contactCount<MAX_CONTACT) {
            contact[contactCount]=new Contact(name, email, num);
            contactCount++;
        }else{
            System.out.println("Contact list is full..");
        }
    }

    public void display(){
        for (int i = 0; i < contact.length; i++) {
            System.out.println("Name: "+contact[i].getName()+", Email: "+contact[i].getEmail()+", Phone Num: "+contact[i].getPhoneNumber());
        }
    }
    public static void main(String[] args){
        ContactManagement manager=new ContactManagement();
        manager.addContact("Bob", "234-567-8901", "bob@example.com");
        manager.addContact("Charlie", "345-678-9012", "charlie@example.com");
        manager.addContact("Alice", "123-456-7890", "alice@example.com");
        
        manager.display();
    }
}
