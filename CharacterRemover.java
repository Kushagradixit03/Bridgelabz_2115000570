import java.util.Scanner;
public class L_Two_10 {
	public static String removeCharacter(String text, char characterToRemove) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != characterToRemove) {
                result += text.charAt(i);
            }
        }
        return result;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        char charToRemove = sc.next().charAt(0);
		String modifiedText = removeCharacter(inputText, charToRemove);
		System.out.println(modifiedText);
    }
}
