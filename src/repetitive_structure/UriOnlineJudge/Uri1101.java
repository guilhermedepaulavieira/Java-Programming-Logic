package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		while (m > 0 && n > 0) {

			int smaller = m;
			int bigger = n;
			
			if (m > n) {
				smaller = n;
				bigger = m;
			}
			
			int sum = 0;
			for (int i=smaller; i<=bigger; i++) {
				sum += i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + sum);
			
			m = sc.nextInt();
			n = sc.nextInt();
		}
		
		sc.close();
	}
}
