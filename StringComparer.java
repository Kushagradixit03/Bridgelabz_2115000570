import java.util.Scanner;

public class StringComparer {
    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);
        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 < c2) {
                return -1; 
            } else if (c1 > c2) {
                return 1; 
            }
        }
        
        if (length1 < length2) {
            return -1; 
        } else if (length1 > length2) {
            return 1; 
        }
        
        return 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int result = compareStrings(str1, str2);
        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("The first string is lexicographically smaller.");
        } else {
            System.out.println("The first string is lexicographically larger.");
        }
    }
}
