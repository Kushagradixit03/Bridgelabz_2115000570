import java.util.Scanner;
public class L_Two_10 {
	public static double calculateBMI(double weight, double height) {
        height = height / 100; 
        return weight / (height * height); 	
    }
	public static String[] determineBMIStatus(double[] bmiValues) {
        String[] status = new String[bmiValues.length];
        for (int i = 0; i < bmiValues.length; i++) {
            if (bmiValues[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmiValues[i] >= 25 && bmiValues[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // 10 rows for each person, 3 columns (weight, height, BMI)
        double[] bmiValues = new double[10]; // To store the BMI values for status checking

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]); 
            bmiValues[i] = teamData[i][2]; 
        }

        String[] bmiStatus = determineBMIStatus(bmiValues); 

        // Display the BMI and status for each person
        System.out.println("\nBMI and Status for Each Person:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s\n",
                    i + 1, teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }

    }
}
