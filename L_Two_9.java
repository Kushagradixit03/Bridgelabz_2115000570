import java.util.Scanner;
import java.util.HashMap;

public class L_Two_9 {

    public static char findMostFrequentCharacter(String text) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        char mostFrequentChar = text.charAt(0);
        int maxCount = 0;
        
        for (char c : frequencyMap.keySet()) {
            int count = frequencyMap.get(c);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = c;
            }
        }
        
        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        char mostFrequentChar = findMostFrequentCharacter(inputText);

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
