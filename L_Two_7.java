import java.util.*;
public class L_Two_7{
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] studentAges = new int[10];
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
            if (checker.canStudentVote(studentAges[i])) 
                System.out.println("Student " + (i + 1) + " can vote.");
            else 
                System.out.println("Student " + (i + 1) + " cannot vote.");
        }
    }
}
