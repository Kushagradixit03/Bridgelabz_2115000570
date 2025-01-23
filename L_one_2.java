import java.util.*;
public class L_one_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		String a = "No";
		if(num2<num3){
			if(num1<num2){
				a="Yes";
			}
		}
		else if (num3<num2){
			if(num1<num3){
				a="Yes";	
			}
		}
		
		
		System.out.println(" Is the first number the smallest? "+ a);
	}
}