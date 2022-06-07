package conditioned_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int amount = sc.nextInt();
		
		double total;
		if (cod == 1) {
			total = amount * 4.0;
		}
		else if (cod == 2) {
			total = amount * 4.5;
		}
		else if (cod == 3) {
			total = amount * 5.0;
		}
		else if (cod == 4) {
			total = amount * 2.0;
		}
		else {
			total = amount * 1.5;
		}

		System.out.printf("Total: $ %.2f%n", total);
		
		sc.close();
	}
	
}
