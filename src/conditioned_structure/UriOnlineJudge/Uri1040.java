package conditioned_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float average = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;
		System.out.printf("Average: %.1f%n", average);
		
		if (average >= 7f) {
			System.out.println("Approved student.");
		}
		else if (average < 5f) {
			System.out.println("Failed student.");
		}
		else {
			System.out.println("Student in exam.");
			float examGrade = sc.nextFloat();
			System.out.printf("Exam grade: %.1f%n", examGrade);
			float mediaFinal = (examGrade + average) / 2f;
			if (mediaFinal >= 5f) {
				System.out.println("Approved student.");
			}
			else {
				System.out.println("Failed student.");
			}			
			System.out.printf("Final media: %.1f%n", mediaFinal);
		}
		
		sc.close();
	}
}
