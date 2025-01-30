import java.util.Scanner;

public class  WordReplacer{
	public static String replaceWord(String sentence, String targetWord, String replacementWord) {
        
        return sentence.replace(targetWord, replacementWord);
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String targetWord = sc.nextLine();
        String replacementWord = sc.nextLine();
		String modifiedSentence = replaceWord(sentence, targetWord, replacementWord);
		System.out.println( modifiedSentence);
    }
}
