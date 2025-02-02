import java.util.*;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        double dailyRate = 50.0;  
        return dailyRate * rentalDays;
    }

    public void display() {
        System.out.println("\nCar Rental Information:");
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter car model: ");
        String carModel = sc.nextLine();

        System.out.print("Enter rental day: ");
        int rentalDays = sc.nextInt();

        CarRental userRental = new CarRental(customerName, carModel, rentalDays);

        userRental.display();

    }
}
