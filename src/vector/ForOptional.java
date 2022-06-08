package vector;

import java.util.Scanner;

public class ForOptional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] names = new String[N];

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}

		System.out.println("Names read:");
		for (String s : names) {
			System.out.println(s);
		}

		sc.close();
	}
}
