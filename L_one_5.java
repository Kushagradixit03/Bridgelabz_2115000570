import java.util.*;
public class L_one_5{
	public static int digit(int num){
		if(num>0){
			return 1;
		}
		else if(num<0){
			return -1;
		}
		else{
			return 0;
		}
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(digit(num));
		
	}
}