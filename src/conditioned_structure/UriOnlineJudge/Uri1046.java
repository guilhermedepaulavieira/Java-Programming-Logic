package conditioned_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int startTime = sc.nextInt();
		int finalHour = sc.nextInt();
		
		int duration;
		if (startTime < finalHour) {
			duration = finalHour - startTime;
		}
		else {
			duration = 24 - startTime + finalHour;
		}
		
		System.out.println("THE GAME LAST " + duration + " HOURS(S)");
		
		sc.close();
	}
}
