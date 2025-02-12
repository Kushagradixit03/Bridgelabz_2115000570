class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieList {
    private MovieNode head;
    private MovieNode tail;

    public MovieList() {
        head = null;
        tail = null;
    }

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void removeMovieByTitle(String title) {
        MovieNode temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            } else {
                head = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            } else {
                tail = temp.prev;
            }
        }
    }

    public void searchMoviesByDirectorOrRating(String director, double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equals(director) || temp.rating == rating) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            }
            temp = temp.next;
        }
    }

    public void displayMoviesForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayMoviesReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    public void updateMovieRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();
        movieList.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieList.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);

        System.out.println("Movies in forward order:");
        movieList.displayMoviesForward();

        System.out.println("\nMovies by Director 'Christopher Nolan' or Rating 9.0:");
        movieList.searchMoviesByDirectorOrRating("Christopher Nolan", 9.0);

        movieList.updateMovieRating("Spider Man", 9.0);
        System.out.println("Updated Movie List:");
        movieList.displayMoviesForward();

        movieList.removeMovieByTitle("Harry Potter");
        System.out.println("After Removal:");
        movieList.displayMoviesForward();
    }
}
