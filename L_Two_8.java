import java.util.Scanner;

public class L_Two_8 {

    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        
        int minLength = Math.min(length1, length2);
        
        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            if (c1 < c2) {
                return -1; // str1 is lexicographically smaller
            } else if (c1 > c2) {
                return 1; // str1 is lexicographically larger
            }
        }
        
        if (length1 < length2) {
            return -1; // str1 is lexicographically smaller (str1 is a prefix of str2)
        } else if (length1 > length2) {
            return 1; // str1 is lexicographically larger (str2 is a prefix of str1)
        }
        
        return 0; // The strings are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
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
