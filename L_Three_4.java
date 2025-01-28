import java.util.Arrays;

public class NumberChecker {

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

    public static int[] reverseDigits(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;  // You can change this number for testing
        int[] digits = storeDigits(number);

        System.out.println("Digits of the number: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));

        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

        System.out.println("Is Palindrome? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}
