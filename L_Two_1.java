import java.util.*;
public class L_Two_1{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year>=1582){
			if(year%4==0){
			if(year%100==0&&year%400==0){
			System.out.println(year+" is a Leap Year.");
			}
			}
			
		}
		else{
		System.out.println(year+" is a not Leap Year.");
		}
		
	}
}