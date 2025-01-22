import java.util.Scanner;

public class L_two_9 {
    public static void main(String[] args) {
        // Create scanner object to take inputs
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs for the sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Define the target distance (5 km)
        double targetDistance = 5000; // in meters

        // Calculate the number of rounds the athlete needs to complete 5 km
        double rounds = targetDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run to complete 5 km is: " + rounds);

        // Close the scanner
        scanner.close();
    }
}
