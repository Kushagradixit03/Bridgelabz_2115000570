import java.util.*;
public class L_Two_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int amarAge = sc.nextInt();
		int akbarAge = sc.nextInt();
		int anthonyAge = sc.nextInt();
		int amarHeight = sc.nextInt();
		int akbarHeight = sc.nextInt();
		int anthonyHeight = sc.nextInt();
		String smallest;
		String largest;
		
		if(amarAge<akbarAge&&amarAge<anthonyAge){
			smallest="amar";
		}
		else if(akbarAge<amarAge&&akbarAge<anthonyAge){
			smallest="akbar";
		}
		else{
			smallest="anthony";
		}
		if(amarHeight<akbarHeight&&amarHeight<anthonyHeight){
			largest="amar";
		}
		else if(akbarHeight<amarHeight&&akbarHeight<anthonyHeight){
			largest="akbar";
		}
		else{
			largest="anthony";
		}
		System.out.println("The youngest friend "+smallest);
		System.out.println("The tallest friend "+largest);
		
		
       

    }
}
