import java.util.*;
public class L_one_6{
	public static boolean season(String month, int date){
		if(month.equals("march")&&date<=20){
			return true;
		}
		else if(month.equals("april")||month.equals("may")){
			return true;
		}
		else if(month.equals("june")&&date>=20){
			return true;
		}
		else{
			return false;
		}
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		int date = sc.nextInt();
		System.out.println(season(month, date));
		
	}
}