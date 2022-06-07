package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int smaller = x;
		int bigger = y;
		
		if (x > y) {
			smaller = y;
			bigger = x;
		}

		int sum = 0;
		for (int i=smaller; i<=bigger; i++) {
			if (i % 13 != 0) {
				sum += i;
			}
		}

		System.out.println(sum);
		
		sc.close();
	}
}
