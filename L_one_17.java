import java.util.*;
public class L_one_17{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int year = sc.nextInt();
		double bonusAmount =0 ;
		if(year>5){
			bonusAmount  = salary+salary/20;
		
		}
		System.out.println("The total salary"+bonusAmount);
	}
}