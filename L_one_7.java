import java.util.*;
public class L_one_7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		int date = sc.nextInt();
		
		if(Objects.equals(month,"march")){
			if(date>=20){
				System.out.println("Its a Spring Season");
			}
		}
		else if(Objects.equals(month,"may")||Objects.equals(month,"april")){
			System.out.println("Its a Spring Season");
		}
		else if(Objects.equals(month,"june")){
			if(date<=20){
				System.out.println("Its a Spring Season");
			}
		}
		else{
		System.out.println("Not a Spring Season");
		}
	}
}