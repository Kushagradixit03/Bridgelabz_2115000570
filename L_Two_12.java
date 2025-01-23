import java.util.*;
public class L_Two_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("Multiples of " + num+ " below 100: ");

        for (int i = 100; i >= 1; i--) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }

    }
}
