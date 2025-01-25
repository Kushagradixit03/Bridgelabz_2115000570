import java.util.*;
public class L_one_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
		int[] multiplicationResult = new int[4];  
		for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; 
        }
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

    }
}