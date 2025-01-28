import java.util.Arrays;

public class L_Three_6 {

    public static int[] findFactors(int number) {
        int[] factors = new int[number];  // Maximum possible number of factors is the number itself
        int count = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        
        // Resize the array to contain only the actual factors
        return Arrays.copyOf(factors, count);
    }

    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = factors[0];
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;  // Exclude the number itself
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;  // Exclude the number itself
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;  // Exclude the number itself
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        
        return sumOfFactorials == number;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 145;  // Example number for testing

        int[] factors = findFactors(number);

        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number? " + isPerfectNumber(number));
        System.out.println("Is Abundant Number? " + isAbundantNumber(number));
        System.out.println("Is Deficient Number? " + isDeficientNumber(number));
        System.out.println("Is Strong Number? " + isStrongNumber(number));
    }
}
