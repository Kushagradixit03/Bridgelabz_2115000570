import java.util.*;
public class L_one_12{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int sum1=0;
		sum=(num*(num+1))/2;
		while(num>0){
		sum1=sum1+num;
		num--;
		}
		if(sum==sum1){
			System.out.println(" both computations was correct");
		}
		else{
			System.out.println(" both computations was incorrect");

		}
	}
}