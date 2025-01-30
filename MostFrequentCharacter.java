import java.util.Scanner;

public class MostFrequentCharacter {
	public static char findMostFrequentCharacter(String text) {
        int maxCount = 0;
        char mostFrequentChar = text.charAt(0);
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }
        return mostFrequentChar;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
		char mostFrequentChar = findMostFrequentCharacter(inputText);
		System.out.println( mostFrequentChar);
    }
}
