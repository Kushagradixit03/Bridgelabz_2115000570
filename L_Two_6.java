import java.util.*;
public class L_Two_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        double[] weights = new double[num];
        double[] heights = new double[num];
        double[] bmis = new double[num];
        String[] statuses = new String[num];

        for (int i = 0; i < num; i++) {
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.printf(heights[i]+", "+ weights[i]+", "+ bmis[i]+", "+ statuses[i]);
        }

    }
}