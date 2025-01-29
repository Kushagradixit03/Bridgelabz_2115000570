import java.util.Scanner;

public class L_Two_5 {

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = sc.nextLine();

        String longestWord = findLongestWord(inputSentence);

        System.out.println("The longest word is: " + longestWord);

    }
}
