package conditioned_structure.UriOnlineJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();
		
		double percentage;
		if (salary <= 400.0) {
			percentage = 15.0;
		}
		else if (salary <= 800.0) {
			percentage = 12.0;
		}
		else if (salary <= 1200.0) {
			percentage = 10.0;
		}
		else if (salary <= 2000.0) {
			percentage = 7.0;
		}
		else {
			percentage = 4.0;
		}
		
		double readjustment = salary * percentage / 100.0;
		double newSalary = salary + readjustment;
		
		System.out.printf("New salary: %.2f%n", newSalary);
		System.out.printf("Gain readjustment: %.2f%n", readjustment);
		System.out.printf("In percentage: %.0f %%%n", percentage);
		
		sc.close();
	}
}
