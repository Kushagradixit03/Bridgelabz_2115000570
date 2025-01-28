public class L_Two_5 {
	public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
	public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
	public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
	public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
	public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
	public static void main(String[] args) {
        double yards = 3;
        double feet = 0.333333;
        double meters = 1;
        double inches = 12;
		System.out.println("3 yards is equal to " + convertYardsToFeet(yards) + " feet.");
        System.out.println("0.333333 feet is equal to " + convertFeetToYards(feet) + " yards.");
        System.out.println("1 meter is equal to " + convertMetersToInches(meters) + " inches.");
        System.out.println("12 inches is equal to " + convertInchesToMeters(inches) + " meters.");
        System.out.println("12 inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
