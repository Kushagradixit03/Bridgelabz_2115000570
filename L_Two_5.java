import java.util.*;
public class L_Two_5{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
		int temp= numb;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp = numb;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}