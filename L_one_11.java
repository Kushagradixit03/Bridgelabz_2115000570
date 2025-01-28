import java.util.*;
public class L_one_11{
	public double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);

		return windChill;
	} 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double temperature = sc.nextDouble();
		double windSpeed = sc.nextDouble();
		L_one_11 a = new L_one_11();
		System.out.println(a.calculateWindChill(temperature,windSpeed));
		
	}
}


