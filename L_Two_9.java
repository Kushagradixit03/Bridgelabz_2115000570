import java.util.*;
public class L_Two_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[][] marks = new double[num][3];
        double[] percentages = new double[num];
        String[] grades = new String[num];

        for (int i = 0; i < num; i++) {
            double physics, chemistry, maths;

            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                physics = sc.nextDouble();
                if (physics < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (physics < 0);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                chemistry = sc.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (chemistry < 0);

            do {
                System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
                maths = sc.nextDouble();
                if (maths < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (maths < 0);

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            double totalMarks = physics + chemistry + maths;
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1)+", "+ marks[i][0]+", "+ marks[i][1]+", "+ marks[i][2]+", "+ percentages[i] +", "+grades[i]);
        }

    }
}