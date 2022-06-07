package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int bigger = sc.nextInt(); 
		int pos = 1;

		
		for (int i=2; i<=100; i++) {
			int x = sc.nextInt();
			if (x > bigger) {
				bigger = x;
				pos = i;
			}
		}

		System.out.println(bigger);
		System.out.println(pos);

		sc.close();
	}
}
