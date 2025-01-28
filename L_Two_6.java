public class L_Two_6{
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        double fahrenheit = 100, celsius = 37, pounds = 150, kilograms = 68, gallons = 5, liters = 20;
        System.out.println("100°F is equal to " + convertFahrenheitToCelsius(fahrenheit) + "°C.");
        System.out.println("37°C is equal to " + convertCelsiusToFahrenheit(celsius) + "°F.");
        System.out.println("150 pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println("68 kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println("5 gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println("20 liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}
