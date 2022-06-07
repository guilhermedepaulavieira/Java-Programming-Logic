package conditioned_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double A, B, C;
		if (n1 > n2 && n1 > n3) {
			A = n1;
			if (n2 > n3) {
				B = n2;
				C = n3;
			}
			else {
				B = n3;
				C = n2;
			}
		}
		else if (n2 > n3) {
			A = n2;
			if (n1 > n3) {
				B = n1;
				C = n3;
			}
			else {
				B = n3;
				C = n1;
			}
		}
		else {
			A = n3;
			if (n1 > n2) {
				B = n1;
				C = n2;
			}
			else {
				B = n2;
				C = n1;
			}
		}
		
		if (A >= B+C) {
			System.out.println("DOES NOT SHAPE TRIANGLE");
		}
		else {
			
			if (A*A == B*B + C*C) {
				System.out.println("RECTANGLE TRIANGLE");
			}
			else if (A*A > B*B + C*C) {
				System.out.println("OBTUSANGLE TRIANGLE");
			}
			else {
				System.out.println("ACUTE TRIANGLE");
			}

			
			if (A == B && B == C) {
				System.out.println("EQUILATERAL TRIANGLE");
			}
			else if (A == B || A == C || B == C) {
				System.out.println("ISOSCELES TRIANGLE");
			}
		}
		
		sc.close();
	}
}
