class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James ", "123456");
        Book book2 = new Book("Data Structures", "Robert ", "213456");

        displayLibraryName();

        if (book1 instanceof Book) {
            System.out.println("Book 1 Details:");
            book1.displayBookDetails();
        }

        if (book2 instanceof Book) {
            System.out.println("Book 2 Details:");
            book2.displayBookDetails();
        }

        Object obj = new Object();
        if (obj instanceof Book) {
            System.out.println("This is a Book object.");
        } else {
            System.out.println("This is not a Book object.");
        }
    }
}
