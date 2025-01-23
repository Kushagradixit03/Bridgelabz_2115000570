import java.util.*;
public class L_one_1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean a=false;
		if (num%5==0){
			a=true;
		}
		else{
			a=false;
		}
		System.out.println("Is the number " +num+ " divisible by 5? "+a);
	}
}