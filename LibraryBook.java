import java.util.*;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book() {
        this.title = "Title";
        this.author = "Author";
        this.price = 0.0;
        this.available = true;
    }

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;  
            System.out.println("You have borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available.");
            return false;
        }
    }

    public void returnBook() {
        available = true; 
        System.out.println("Thank you for returning \"" + title + "\".");
    }

    public void display() {
        System.out.println("\nBook Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 10.99, true);
        book1.display();
        String response = sc.nextLine().trim().toLowerCase();
        
        if (response.equals("yes")) {
            book1.borrowBook();
        }
        book1.display();
        response = sc.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            book1.returnBook();
        }
        book1.display();
    }
}
