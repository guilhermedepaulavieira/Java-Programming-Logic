package sequential_structure.uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		String name;
	    double salary, sales, all;

	    name = sc.next();
	    salary = sc.nextDouble();
	    sales = sc.nextDouble();

	    all = salary + sales * 0.15;

	    System.out.printf("ALL = R$ %.2f%n", all);
		
		sc.close();
	}
}
