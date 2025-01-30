import java.util.Scanner;
public class LongestWordFinder {
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
        String inputSentence = sc.nextLine();
        String longestWord = findLongestWord(inputSentence);
        System.out.println(longestWord);
    }
}
