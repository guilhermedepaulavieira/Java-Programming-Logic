package sequential_structure.uriOnlineJudge;

import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, z, k, t;

		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		k = (x + y + Math.abs(x - y)) / 2;

		t = (k + z + Math.abs(k - z)) / 2;

		System.out.println(t + " It's the biggest");

		sc.close();
	}
}
