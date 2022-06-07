package conditioned_structure.UriOnlineJudge;

import java.util.Scanner;

public class Uri1049 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String word3 = sc.nextLine();
		
		if (word1.equals("vertebrate")) {
			if (word2.equals("bird")) {
				if (word3.equals("carnivore")) {
					System.out.println("eagle");
				}
				else {
					System.out.println("pigeon");
				}
			}
			else {
				if (word3.equals("omnivorous")) {
					System.out.println("man");
				}
				else {
					System.out.println("cow");
				}
			}
		}
		else {
			if (word2.equals("insect")) {
				if (word3.equals("hematophagous")) {
					System.out.println("flea");
				}
				else {
					System.out.println("caterpillar");
				}
			}
			else {
				if (word3.equals("hematophagous")) {
					System.out.println("leech");
				}
				else {
					System.out.println("earthworm");
				}
			}
		}
		
		sc.close();
	}
}
