package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int start = 1;
		
		for (int i=1; i<=n; i++) {
			
			int second = start + 1;
			int thrid = start + 2;
			System.out.printf("%d %d %d PUM%n", start, second, thrid);

			start += 4;
		}
		
		sc.close();
	}
}
