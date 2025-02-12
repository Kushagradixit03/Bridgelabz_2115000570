class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;
    Book next, prev;

    public Book(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = this.prev = null;
    }
}

class Library {
    private Book head, tail;

    public Library() {
        this.head = this.tail = null;
    }

    public void addFirst(String title, String author, String genre, int bookId, boolean available) {
        Book newBook = new Book(title, author, genre, bookId, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    public void addLast(String title, String author, String genre, int bookId, boolean available) {
        Book newBook = new Book(title, author, genre, bookId, available);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void removeBook(int bookId) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public Book searchBook(int bookId) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void updateAvailability(int bookId, boolean available) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.available = available;
                return;
            }
            current = current.next;
        }
    }

    public void displayBooksForward() {
        Book current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookId + ", Available: " + current.available);
            current = current.next;
        }
    }

    public void displayBooksReverse() {
        Book current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookId + ", Available: " + current.available);
            current = current.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Book current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.addFirst("Book1", "Author1", "Fiction", 1, true);
        library.addLast("Book2", "Author2", "Non-fiction", 2, false);
        library.addLast("Book3", "Author3", "Fiction", 3, true);

        library.displayBooksForward();
        System.out.println("Total books in library: " + library.countBooks());

        library.removeBook(2);
        library.displayBooksForward();
    }
}
