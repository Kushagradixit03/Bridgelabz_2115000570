import java.util.*;
public class RemoveDuplicates {
    public static String removeDuplicates(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (!result.contains(String.valueOf(text.charAt(i)))) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        String modifiedText = removeDuplicates(inputText);
        System.out.println(modifiedText);
    }
}
