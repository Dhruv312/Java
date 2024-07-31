import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Cart {
    private Item[] item;
    private int counter;

    public Cart(int capacity) {
        this.counter = 0;
        this.item = new Item[capacity];
    }

    public void addItem(Item item1) {
        if (counter < item.length) {
            item[counter] = item1;
            counter++;
        } else {
            System.out.println("Cannot add more items.");
        }
    }

    public void removeItem(String name) {
        for (int i = 0; i < counter; i++) {
            if (item[i].getName().equals(name)) {
                for (int j = i; j < counter - 1; j++) {
                    item[j] = item[j + 1];
                }
                item[counter - 1] = null;
                counter--;
                return;
            }
        }
    }

    public void removeItem(double price) {
        for (int i = 0; i < counter; i++) {
            if (item[i].getPrice() == price) {
                for (int j = i; j < counter - 1; j++) {
                    item[j] = item[j + 1];
                }
                item[counter - 1] = null;
                counter--;
                return;
            }
        }
    }

    public void removeItem(int quantity) {
        for (int i = 0; i < counter; i++) {
            if (item[i].getQuantity() == quantity) {
                for (int j = i; j < counter - 1; j++) {
                    item[j] = item[j + 1];
                }
                item[counter - 1] = null;
                counter--;
                return;
            }
        }
    }

    public Item findItem(String name) {
        for (int i = 0; i < counter; i++) {
            if (item[i].getName().equals(name)) {
                System.out.println("Name: " + item[i].getName() + ", Price: " + item[i].getPrice() + ", Quantity: " + item[i].getQuantity());
                return item[i];
            }
        }
        System.out.println("Item not found.");
        return null;
    }

    public void updateQuantity(String name, int quantity) {
        Item itemUpdate = findItem(name);
        if (itemUpdate != null) {
            itemUpdate.setQuantity(quantity);
        }
    }

    public void updatePrice(String name, double price) {
        Item itemUpdate = findItem(name);
        if (itemUpdate != null) {
            itemUpdate.setPrice(price);
        }
    }

    public void displayInfo() {
        for (int i = 0; i < counter; i++) {
            System.out.println("Name: " + item[i].getName() + ", Price: " + item[i].getPrice() + ", Quantity: " + item[i].getQuantity());
        }
    }
}

public class T {
    public static void main(String[] args) {
        Cart cart = new Cart(10);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item\n2. Find Item\n3. Remove Item\n4. Update Item\n5. Display Items\nEnter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.next();
                    System.out.print("Enter Item Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Item Quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(new Item(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Find Item Name: ");
                    String name1 = sc.next();
                    cart.findItem(name1);
                    break;
                case 3:
                    System.out.println("Remove Item:");
                    System.out.println("1. By Name\n2. By Price\n3. By Quantity\nEnter the choice: ");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.print("Name: ");
                            String name3 = sc.next();
                            cart.removeItem(name3);
                            break;
                        case 2:
                            System.out.print("Price: ");
                            double price1 = sc.nextDouble();
                            cart.removeItem(price1);
                            break;
                        case 3:
                            System.out.print("Quantity: ");
                            int quantity1 = sc.nextInt();
                            cart.removeItem(quantity1);
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Update Item:");
                    System.out.println("1. Price\n2. Quantity\nEnter the choice: ");
                    int choice2 = sc.nextInt();
                    System.out.print("Enter the name for update: ");
                    String name_u = sc.next();
                    switch (choice2) {
                        case 1:
                            System.out.print("New Price: ");
                            double price_u = sc.nextDouble();
                            cart.updatePrice(name_u, price_u);
                            break;
                        case 2:
                            System.out.print("New Quantity: ");
                            int quantity_u = sc.nextInt();
                            cart.updateQuantity(name_u, quantity_u);
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 5:
                    cart.displayInfo();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

