package sequential_structure.uriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class uri1021 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N;
		int quotient, rest, grade, coin;
		
		N = sc.nextDouble();
		
		rest = (int) (N * 100.0 + 0.5);

		System.out.println("GRADES:");
		
		grade = 100;
		quotient = rest / (grade * 100);
		System.out.println(quotient + " grades(s) de $ " + grade + ".00");
	    rest = rest % (grade * 100);

		grade = 50;
		quotient = rest / (grade * 100);
		System.out.println(quotient + " grades(s) de $ " + grade + ".00");
	    rest = rest % (grade * 100);

		grade = 20;
		quotient = rest / (grade * 100);
		System.out.println(quotient + " grades(s) de $ " + grade + ".00");
	    rest = rest % (grade * 100);

		grade = 10;
		quotient = rest / (grade * 100);
		System.out.println(quotient + " grades(s) de $ " + grade + ".00");
	    rest = rest % (grade * 100);

		grade = 5;
		quotient = rest / (grade * 100);
		System.out.println(quotient + " grades(s) de $ " + grade + ".00");
	    rest = rest % (grade * 100);

		grade = 2;
		quotient = rest / (grade * 100);
		System.out.println(quotient + " grades(s) de $ " + grade + ".00");
	    rest = rest % (grade * 100);

	    System.out.println("COIN:");

	    
		coin = 100;
		quotient = rest / coin;
		System.out.println(quotient + " coin(s) de $ 1.00");
	    rest = rest % coin;

		coin = 50;
		quotient = rest / coin;
		System.out.println(quotient + " coin(s) de $ 0.50");
	    rest = rest % coin;

		coin = 25;
		quotient = rest / coin;
		System.out.println(quotient + " coin(s) de $ 0.25");
	    rest = rest % coin;

		coin = 10;
		quotient = rest / coin;
		System.out.println(quotient + " coin(s) de $ 0.10");
	    rest = rest % coin;

		coin = 5;
		quotient = rest / coin;
		System.out.println(quotient + " moeda(s) de R$ 0.05");
	    rest = rest % coin;

		System.out.println(rest + " moeda(s) de R$ 0.01");
	    
		sc.close();
	}
}
