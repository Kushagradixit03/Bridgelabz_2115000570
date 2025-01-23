import java.util.*;
public class L_Two_4{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=num-1;
		boolean isBoolean=true;
		if(num>1){
			while(i>1){
			if(num%i==0){
				isBoolean=false;
			}
			i--;
			}
		
		}
		System.out.println("The number "+num +" is boolean "+isBoolean);
		
	}
}