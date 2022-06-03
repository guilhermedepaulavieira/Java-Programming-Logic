package sequential_structure.uriOnlineJudge;

import java.util.Scanner;

public class uri1001 {

	// Site www.urionlinejudge.com.br
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, X;
		
		A = sc.nextInt();
		B = sc.nextInt();

		X = A + B;
		
		System.out.println("X = " + X);
		
		sc.close();
	}
}
