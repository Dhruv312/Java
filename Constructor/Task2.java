// 2. Overloading Constructors:
//    Design a 'Book' class with fields for 'title', 'author', and 'price'. Implement multiple constructors: one default, one that takes only 'title' and 'author', and another that takes all three fields. Write a method to display book details.
class Book{
    private String titel;
    private String author;
    private double price;

    public Book(){
        titel=null;
        author=null;
        price=0.0;
    }
    public Book(String titel , String author){
        this.titel=titel;
        this.author=author;
    }
    public Book(String titel , String author,double price){
        this.titel=titel;
        this.author=author;
        this.price=price;
    }

    void display(){
        System.out.println("Titel: "+titel);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
};
public class Task2 {
    public static void main(String[] args){
        Book b1=new Book();
        b1.display();
        Book b2=new Book("A","AA");
        b2.display();
        Book b3=new Book("B","BB",120);
        b3.display();
    }
}
