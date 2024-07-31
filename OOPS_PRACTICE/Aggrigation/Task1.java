// Scenario 1: Library Catalog System
// Design a library catalog system where a library has multiple books. The library class contains a list of book objects, representing an aggregation relationship.
class Book {
    private String title;
    private String author;
    private int ISBN;
    private int year;

    public Book(String title, String author, int ISBN, int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    Book book[];
    int bookCount;

    public Library(int capacity) {
        bookCount = 0;
        book = new Book[capacity];
    }

    public void addBook(Book book1) {
        if (bookCount < book.length) {
            book[bookCount] = book1;
            bookCount++;
        } else {
            System.out.println("can not add more book");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (book[i].getTitle() == title) {
                for (int j = i; j < bookCount - 1; j++) {
                    book[j] = book[j + 1];
                }
                bookCount--;
            }
        }
    }

    public void display() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + book[i].getTitle() + " ,Author: " + book[i].getAuthor() + " ,ISBN: "
                    + book[i].getISBN() + " ,Year: " + book[i].getYear());
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 10, 2012));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 20, 1990));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 30, 2000));
        library.addBook(new Book("Don Quixote", "Miguel de Cervantes", 40, 2024));

        System.out.println("-------Book Info-------");
        library.display();
        library.removeBook("To Kill a Mockingbird");
        System.out.println("-------Remove after Book Info-------");
        library.display();
    }
}
