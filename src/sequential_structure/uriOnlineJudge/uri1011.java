package sequential_structure.uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, volume;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		
		volume = 4.0 / 3.0 * pi * Math.pow(raio, 3.0); 
		
		System.out.printf("VOLUME = %.3f\n", volume);
		
		sc.close();
	}
}
