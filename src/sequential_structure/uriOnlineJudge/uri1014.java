package sequential_structure.uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int km;
	    double liters, consumption;

	    km = sc.nextInt();
	    liters = sc.nextDouble();

	    consumption = km / liters;

	    System.out.printf("%.3f km/l%n", consumption);
		
		sc.close();
	}
}
