import java.util.*;
public class L_Two_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[][] personData = new double[num][3];
        String[] weightStatus = new String[num];

        for (int i = 0; i < num; i++) {
            double weight, height;
            do {
                weight = sc.nextDouble();
            } while (weight <= 0);
            do {
                height = sc.nextDouble();
            } while (height <= 0);
            personData[i][0] = weight;
            personData[i][1] = height;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
		for (int i = 0; i < num; i++) {
            System.out.print((i + 1)+", "+ personData[i][1]+", "+ personData[i][0]+", "+ personData[i][2]+", "+ weightStatus[i]);
        }
    }
}