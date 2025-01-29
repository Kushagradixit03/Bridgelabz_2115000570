import java.util.Scanner;

public class L_Three_5 {

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int length = cleanedInput.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(result);
    }
}
