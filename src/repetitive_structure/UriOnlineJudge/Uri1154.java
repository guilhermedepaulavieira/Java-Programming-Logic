package repetitive_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		while (age >= 0) {
			sum = sum + age;
			count = count + 1;
			age = sc.nextInt();
		}
		
		double media = (double) sum / count;
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}
}
