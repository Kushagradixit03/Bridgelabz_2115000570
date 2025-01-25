import java.util.*;
public class L_Two_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
		int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        while (number != 0) {
            if (index == maxDigits) {
                maxDigits += 10; 
                int[] temp = new int[maxDigits]; 
                System.arraycopy(digits, 0, temp, 0, digits.length); 
                digits = temp; 
            }

            digits[index] = number % 10;  
            number = number / 10;         
            index++;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}