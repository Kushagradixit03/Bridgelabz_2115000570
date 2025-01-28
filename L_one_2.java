import java.util.*;
public class L_one_2{
	public static void noofStudents(int noOfStudents){
		noOfStudents = (noOfStudents*(noOfStudents-1))/ 2;
		System.out.println("The number of possible handshakes " +noOfStudents);
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		noofStudents(noOfStudents);
	}
}