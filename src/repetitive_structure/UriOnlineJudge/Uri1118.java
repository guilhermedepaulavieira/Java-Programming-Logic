package repetitive_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int newCalculation = 1;
		
		while (newCalculation == 1) {
			double note1 = sc.nextDouble();
			while (note1 < 0.0 || note1 > 10.0) {
				System.out.println("invalid note");
				note1 = sc.nextDouble();
			}
			
			double note2 = sc.nextDouble();
			while (note2 < 0.0 || note2 > 10.0) {
				System.out.println("invalid note");
				note2 = sc.nextDouble();
			}
			
			double media = (note1 + note2) / 2.0;
			System.out.printf("media = %.2f%n", media);
			
			System.out.println("New Calculation (1-yes 2-no)");
			newCalculation = sc.nextInt();
			while (newCalculation != 1 && newCalculation != 2) {
				System.out.println("New Calculation (1-yes 2-no)");
				newCalculation = sc.nextInt();
			}
		}

		sc.close();
	}
}
