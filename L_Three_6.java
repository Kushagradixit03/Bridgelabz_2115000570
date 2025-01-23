import java.util.*;
public class L_Three_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        String op = sc.next();
        double num2 = sc.nextDouble();
        
        double result = 0;
        boolean validOperator = true;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    validOperator = false;
                }
                break;
            default:
                validOperator = false;
                System.out.println("Invalid Operator.");
        }
        
        if (validOperator) {
            System.out.println("Result: " + result);
        }

    }
}
