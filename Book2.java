import java.util.*;
public class Book2 {
    public String ISBN;     
    protected String title;   
    private String author; 

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);  
        System.out.println("Title: " + title); 
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String ISBN = sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        Book book1 = new Book(ISBN, title, author);

        book1.displayBookDetails();

        EBook eBook1 = new EBook(ISBN + "-E", title + " (Ebook)", author + " (Ebook)");
        eBook1.displayEBookDetails(); 

        System.out.print("Enter a new author name: ");
        String newAuthor = scanner.nextLine();
        book1.setAuthor(newAuthor);  

        System.out.println("Updated Book Details:");
        book1.displayBookDetails();
 
    }
}
