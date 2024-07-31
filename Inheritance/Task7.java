// 7. Static Block and Static Methods in Single Inheritance:
//    - Problem Statement: Create a single inheritance setup with classes 'Library' and 'Book'. The 'Library' class should have a static block to initialize a static variable 'libraryName', and a static method 'showLibraryInfo()'. The 'Book' class should have attributes 'title' and 'author', and a method 'showBookInfo()'. Demonstrate the use of static blocks, static methods, and the 'super' keyword.
class Library{
    public static String libraryName;

    public static void showLibraryInfo(){
        System.out.println("Library Name: "+libraryName);
    }
}

class Book extends Library{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void showBookInfo(){
       super.showLibraryInfo();
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);

    }
}

public class Task7 {
    public static void main(String[] args){
        Library.libraryName="Gandhinagar Library";
        Book b1= new Book("1991","George");
        b1.showBookInfo();
    }
}
