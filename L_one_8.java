import java.util.*;
public class L_one_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int capacity = 10;
        int[] factors = new int[capacity];
        int count = 0;
		for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (count == capacity) {
                    capacity *= 2;
                    int[] temp = new int[capacity];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[count++] = i;
            }
        }
        
        System.out.println("Factors of " + num + ":");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}