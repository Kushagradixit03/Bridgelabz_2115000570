import java.util.*;
public class L_one_11{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		while(true){
			double user = sc.nextDouble();
			if(user<=0){
				break;
				
			}
			total=total+user;
		}
		System.out.println("The total is "+total);
	}
}