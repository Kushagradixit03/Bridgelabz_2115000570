import java.util.Arrays;

public class L_Three_3 {
	public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
	public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = 0; i < numDigits; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < numDigits / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[numDigits - i - 1];
            digits[numDigits - i - 1] = temp;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double sumOfSquaresOfDigits(int[] digits) {
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // 10 possible digits (0-9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // Store the digit
            frequency[i][1] = 0;  // Initialize frequency to 0
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int number = 21;  // You can change this number for testing
        int[] digits = storeDigits(number);
        
        System.out.println("Digits of the number: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {  // Only print digits that appear in the number
                System.out.println("Digit " + freq[0] + " appears " + freq[1] + " times");
            }
        }
    }
}
