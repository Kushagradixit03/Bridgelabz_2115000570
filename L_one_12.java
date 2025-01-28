public class L_one_12{

    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] results = new double[3];
        double radians = Math.toRadians(angle);
        results[0] = Math.sin(radians);
        results[1] = Math.cos(radians);
        results[2] = Math.tan(radians);
        return results;
    }

    public static void main(String[] args) {
        double angle = 45.0;
        double[] trigResults = calculateTrigonometricFunctions(angle);
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + trigResults[0]);
        System.out.println("Cosine: " + trigResults[1]);
        System.out.println("Tangent: " + trigResults[2]);
    }
}
