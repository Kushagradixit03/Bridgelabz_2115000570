import java.util.*;

public class L_Two_2 {

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        String reversedText = reverseString(inputText);

        System.out.println("Reversed string: " + reversedText);

    }
}
