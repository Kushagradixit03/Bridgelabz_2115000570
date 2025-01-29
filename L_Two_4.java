import java.util.*;
import java.util.LinkedHashSet;

public class L_Two_4 {

    public static String removeDuplicates(String text) {
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        
        for (int i = 0; i < text.length(); i++) {
            charSet.add(text.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        for (Character c : charSet) {
            result.append(c);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        String modifiedText = removeDuplicates(inputText);

        System.out.println("Modified string (duplicates removed): " + modifiedText);
    }
}
