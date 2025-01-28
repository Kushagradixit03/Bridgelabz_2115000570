import java.util.*;
public class L_one_9{
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int ans[] = new int[2];
		ans[0] = number/divisor;
		ans[1] = number%divisor;
		return ans;
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divisor = sc.nextInt();
		int ans[]=findRemainderAndQuotient(number,divisor);
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
		
	}
}