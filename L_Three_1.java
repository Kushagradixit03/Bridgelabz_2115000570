import java.util.*;
public class L_Three_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int sum = 0;
        int Number = num;
		while (Number != 0) {
            int digit = Number % 10;
            sum += digit * digit * digit;
            Number /= 10;
        }
		if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

    }
}
