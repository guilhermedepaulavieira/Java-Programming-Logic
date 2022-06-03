package sequential_structure.uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, hours;
	    double hourValue, salario;

	    number = sc.nextInt();
	    hours = sc.nextInt();
	    hourValue = sc.nextDouble();

	    salario = hourValue * hours;

	    System.out.println("NUMBER = " + number);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}
