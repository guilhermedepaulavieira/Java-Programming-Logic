package repetitive_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1094 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int rabbit = 0;
		int frogs = 0;
		int sapos = 0;
		
		for (int i=0; i<n; i++) {
			
			int quantie = sc.nextInt();
			char tip = sc.next().charAt(0);
			
			if (tip == 'C') {
				rabbit = rabbit + quantie;
			}
			else if (tip == 'R') {
				frogs = frogs + quantie;
			}
			else {
				sapos = sapos + quantie;
			}
		}

		int all = rabbit + frogs + sapos;
		double porcentageRabbit = (double) rabbit / all * 100.0;
		double porcentageMice = (double) frogs / all * 100.0;
		double porcentageFrogs = (double) sapos / all * 100.0;

		System.out.println("All: " + all + " cobaias");
		System.out.println("All the rabbit: " + rabbit);
		System.out.println("All the mice: " + frogs);
		System.out.println("All the frogs: " + sapos);
		System.out.printf("percentage of rabbits: %.2f %%%n", porcentageRabbit);
		System.out.printf("percentage of mice: %.2f %%%n", porcentageMice);
		System.out.printf("percentage of frogs: %.2f %%%n", porcentageFrogs);
		
		sc.close();
	}
}
