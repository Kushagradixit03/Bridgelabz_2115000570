import java.util.*;
public class L_one_16{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int numberofstudent=sc.nextInt();
	double maximumnumberofstudent = (numberofstudent*(numberofstudent-1))/2;
	System.out.println("The maximum number of handsakes "+ maximumnumberofstudent);
	}
} 