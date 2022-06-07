package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1144 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			
			int second = i * i;
			int third = i * i * i;
			System.out.printf("%d %d %d%n", i, second, third);
			System.out.printf("%d %d %d%n", i, second + 1, third + 1);
		}
		
		sc.close();
	}
}
