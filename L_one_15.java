import java.util.*;
public class L_one_15{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int fact = 1;
		for(int i=n;i>0;i--){
			fact=fact*i;
			
		}
		System.out.println("Factorail of a number "+num+ " is "+fact);
	}
}