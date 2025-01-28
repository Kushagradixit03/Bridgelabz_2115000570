import java.util.Scanner;

public class L_one_4 {

    public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3;
        double rounds = totalDistance / perimeter;
        return (int) Math.ceil(rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
		double totalDistance = 5000;
		int rounds = calculateRounds(side1, side2, side3, totalDistance);
		System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 kilometers.");
       
    }
}
