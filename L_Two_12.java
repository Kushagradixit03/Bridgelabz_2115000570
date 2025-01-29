import java.util.Scanner;

public class L_Two_12 {

    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
        
        return sentence.replace(targetWord, replacementWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String targetWord = sc.nextLine();

        System.out.print("Enter the word to replace with: ");
        String replacementWord = sc.nextLine();

        String modifiedSentence = replaceWord(sentence, targetWord, replacementWord);

        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
