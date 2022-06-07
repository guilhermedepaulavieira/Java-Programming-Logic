package repetitive_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {

public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double note1 = sc.nextDouble();
		while (note1 < 0.0 || note1 > 10.0) {
			System.out.println("Invalid note");
			note1 = sc.nextDouble();
		}
		
		double note2 = sc.nextDouble();
		while (note2 < 0.0 || note2 > 10.0) {
			System.out.println("Invalid note");
			note2 = sc.nextDouble();
		}
		
		double media = (note1 + note2) / 2.0;
		System.out.printf("media = %.2f%n", media);

		sc.close();
	}
}
