package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			
			
			if (x % 2 != 0) {
				x = x + 1;
			}
			
			
			int sum = x + x + 2 + x + 4 + x + 6 + x + 8; 
			System.out.println(sum);
			
			x = sc.nextInt();
		}
		
		sc.close();
	}
}
