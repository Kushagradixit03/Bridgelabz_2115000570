import java.util.Scanner;

public class L_Three_8 {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Choose the conversion type (1 for Fahrenheit to Celsius, 2 for Celsius to Fahrenheit): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "° Fahrenheit is " + celsius + "° Celsius.");
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "° Celsius is " + fahrenheit + "° Fahrenheit.");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

    }
}
