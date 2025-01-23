import java.util.*;
public class L_Two_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
		int height = sc.nextInt();
		double BMI = weight/(height*height);

                if (BMI<=18.4) {
                    System.out.println("Underweight");
                }
                else if (BMI<24.9&&BMI>18.5) {
                    System.out.println("Normal");
                }
                else if (BMI<39.9&&BMI>25.0) {
                    System.out.println("Overweight");
                }
                
                else {
                    System.out.println("Obese");
                }
			
       

    }
}
