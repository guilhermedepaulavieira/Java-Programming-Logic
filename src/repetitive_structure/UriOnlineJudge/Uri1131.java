package repetitive_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int novoGrenal = 1;
		
		while (novoGrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();
			
			if (golsInter > golsGremio) {
				vitoriasInter = vitoriasInter + 1;
			}
			else if (golsGremio > golsInter) {
				vitoriasGremio = vitoriasGremio + 1;
			}
			else {
				empates = empates + 1;
			}

			System.out.println("new grenal (1-yes 2-no)");
			novoGrenal = sc.nextInt();
		}
		
		int total = vitoriasGremio + vitoriasInter + empates;
		
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter won");
		}
		else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio won");
		}
		else {
			System.out.println("There was no winner");
		}
		
		sc.close();
	}
}
