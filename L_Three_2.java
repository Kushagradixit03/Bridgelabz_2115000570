import java.util.Arrays;
public class L_Three_2 {
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits, int number) {
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }
	public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }
	public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }
	public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);
        System.out.println("Digits of the number: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(digits, number));
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
