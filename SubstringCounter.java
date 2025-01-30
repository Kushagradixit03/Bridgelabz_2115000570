import java.util.*;
public class SubstringCounter{
	public static int countSubstringOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.nextLine();
        String substring = sc.nextLine();
		int occurrences = countSubstringOccurrences(mainString, substring);
		System.out.println("The substring occurs " + occurrences + " times.");
	}
}
