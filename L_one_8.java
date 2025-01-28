import java.util.*;
public class L_one_8{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int ans[] = new int[2];
		int sum = 0;
		if(number1>number2&&number1>number3){
			ans[0]=number1;
		}
		else if(number2>number1&&number2>number3){
			 ans[0]=number2;
		}
		else{
			 ans[0]=number3;
		}
		if(number1<number2&&number1<number3){
			ans[1]=number1;
		}
		else if(number2<number1&&number2<number3){
			ans[1]=number2;
		}
		else{
			ans[1]=number3;
		}
		return ans;
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int ans[]=findSmallestAndLargest(number1,number2,number3);
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
		
	}
}