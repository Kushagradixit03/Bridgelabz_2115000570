import java.util.*;
public class  L_Three_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int sum = 0;
        int Number = num;
        
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        if (Number % sum == 0) {
            System.out.println(Number + " is a Harshad number.");
        } else {
            System.out.println(Number + " is not a Harshad number.");
        }
        
    }
}
