package sequential_structure.uriOnlineJudge;

import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, year, month, days, rest;
		
		N = sc.nextInt();
		
		year = N / 365;
		rest = N % 365;
		month = rest / 30;
		days = rest % 30;
		
		System.out.println(year + " year(s)");
		System.out.println(month + " month(es)");
		System.out.println(days + " day(s)");
		
		sc.close();
	}
}
