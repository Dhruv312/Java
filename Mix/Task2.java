// 2. Book Class: Design a `Book` class with a constructor to store information about a book, including its title, author, and publication year.

class Book{
    private String title;
    private String author;
    private int year;

    public Book(String titel , String author,int  year){
        this.title=titel;
        this.author=author;
        this.year=year;
    }

    void display(){
        System.out.println("Titel: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
    }
};
public class Task2 {
    public static void main(String[] args){
        Book b3=new Book("B","BB",2020);
        b3.display();
    }
}
