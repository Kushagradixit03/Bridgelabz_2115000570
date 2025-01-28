import java.util.*;

public class L_Three_9 {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];  // result[0] -> slope (m), result[1] -> y-intercept (b)

        double m = (y2 - y1) / (x2 - x1);  // Calculate the slope (m)
        double b = y1 - m * x1;  // Calculate the y-intercept (b)

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        System.out.println("Equation of the line: y = " + slope + "x + " + intercept);

    }
}
