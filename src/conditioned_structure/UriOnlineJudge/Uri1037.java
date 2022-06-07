package conditioned_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double number = sc.nextDouble();
		
		if (number < 0.0 || number > 100.0) {
			System.out.println("Out of range");
		}
		else if (number <= 25.0) {
			System.out.println("break [0,25]");
		}
		else if (number <= 50.0) {
			System.out.println("break (25,50]");
		}
		else if (number <= 75.0) {
			System.out.println("break (50,75]");
		}		
		else {
			System.out.println("break (75,100]");
		}
		
		sc.close();
	}
}
