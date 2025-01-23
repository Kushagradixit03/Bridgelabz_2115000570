import java.util.*;
public class L_one_13{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int sum1=0;
		sum=(num*(num+1))/2;
		for(int i=num;i>0;i--){
		sum1=sum1+i;
		
		}
		if(sum==sum1){
			System.out.println(" both computations was correct");
		}
		else{
			System.out.println(" both computations was incorrect");

		}
	}
}