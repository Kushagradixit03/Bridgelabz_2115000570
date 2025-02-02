import java.util.*;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Anonymous";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("\nBooking Guest,Room Type And Nights:");
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter guest name: ");
        String guestName = sc.nextLine();

        System.out.print("Enter room type (e.g., Standard, Deluxe): ");
        String roomType = sc.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking userBooking = new HotelBooking(guestName, roomType, nights);

        HotelBooking copyBooking = new HotelBooking(userBooking);

        userBooking.display();
        copyBooking.display();

    }
}
