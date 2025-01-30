import java.util.*;

public class countVowelsAndConsonants {

    public static void countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        text = text.toLowerCase();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        countVowelsAndConsonants(inputText);
    }
}
