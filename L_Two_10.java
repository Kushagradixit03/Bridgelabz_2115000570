import java.util.Scanner;

public class L_Two_10 {

    public static String removeCharacter(String text, char characterToRemove) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != characterToRemove) {
                result.append(text.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        String modifiedText = removeCharacter(inputText, charToRemove);

        System.out.println("Modified String: " + modifiedText);
    }
}
