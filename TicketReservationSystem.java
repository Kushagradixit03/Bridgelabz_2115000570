class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservation {
    private Ticket head;

    public TicketReservation() {
        this.head = null;
    }

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newTicket;
            newTicket.next = head;
        }
    }

    public void removeTicket(int ticketId) {
        if (head == null) return;
        Ticket current = head, prev = null;
        do {
            if (current.ticketId == ticketId) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    if (current.next == head) {
                        head = null;
                    } else {
                        prev = head;
                        while (prev.next != head) {
                            prev = prev.next;
                        }
                        head = current.next;
                        prev.next = head;
                    }
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }
        Ticket current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    public void searchTicket(String searchBy, String searchValue) {
        Ticket current = head;
        do {
            if ((searchBy.equals("customerName") && current.customerName.equals(searchValue)) || 
                (searchBy.equals("movieName") && current.movieName.equals(searchValue))) {
                System.out.println("Ticket found: Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName + ", Movie: " + current.movieName);
                return;
            }
            current = current.next;
        } while (current != head);
        System.out.println("Ticket not found.");
    }

    public int countTickets() {
        int count = 0;
        Ticket current = head;
        if (current == null) return count;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();
        system.addTicket(1, "Kushagra", "Movie1", "A1", "2025-02-01 15:00");
        system.addTicket(2, "Rohan", "Movie2", "B1", "2025-02-01 16:00");
        system.addTicket(3, "Aman", "Movie1", "C1", "2025-02-01 17:00");

        system.displayTickets();
        System.out.println("Total booked tickets: " + system.countTickets());

        system.removeTicket(2);
        system.displayTickets();
    }
}
