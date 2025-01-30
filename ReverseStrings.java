import java.util.*;

public class ReverseStrings {

    public static String reverseString(String text) {
        String reversed = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        String reversedText = reverseString(inputText);

        System.out.println(reversedText);
    }
}
