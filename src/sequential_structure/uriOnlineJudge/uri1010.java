package sequential_structure.uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int cod1, cod2, qte1, qte2;
	    double price1, price2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    price1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    price2 = sc.nextDouble();

	    total = price1 * qte1 + price2 * qte2;

	    System.out.printf("AMOUNT TO PAY: $ %.2f%n", total);
		
		sc.close();
	}
}
