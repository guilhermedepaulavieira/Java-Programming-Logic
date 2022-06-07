package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1115 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("first");
			}
			else if (x < 0 && y > 0) {
				System.out.println("second");
			}
			else if (x < 0 && y < 0) {
				System.out.println("third");
			}
			else {
				System.out.println("fourth");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
