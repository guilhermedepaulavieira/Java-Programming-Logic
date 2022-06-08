package vector.exerciseVector;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseVector9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] names = new String[N];
		double[] purchases = new double[N];
		double[] sales = new double[N];

		for (int i = 0; i < N; i++) {
			names[i] = sc.next();
			purchases[i] = sc.nextDouble();
			sales[i] = sc.nextDouble();
		}

		
		int contBelow10 = 0;
		int contBetween10and20 = 0;
		int contAboveOf20 = 0;
		for (int i = 0; i < N; i++) {

			double profit = sales[i] - purchases[i];

			double profitPercentage = profit / purchases[i] * 100.0;

			if (profitPercentage < 10.0) {
				contBelow10++;
			} else if (profitPercentage <= 20.0) {
				contBetween10and20++;
			} else {
				contAboveOf20++;
			}
		}
		System.out.println("Profit below 10%: " + contBelow10);
		System.out.println("Profit between 10% and 20%: " + contBetween10and20);
		System.out.println("Profit above 20%: " + contAboveOf20);

		
		double totalBuy = 0.0;
		double totalSales = 0.0;
		for (int i = 0; i < N; i++) {
			totalBuy += purchases[i];
			totalSales += sales[i];
		}

		double totalProfit = totalSales - totalBuy;

		System.out.printf("Total purchase amount: %.2f%n", totalBuy);
		System.out.printf("Total sales value: %.2f%n", totalSales);
		System.out.printf("Total profit: %.2f%n", totalProfit);

		sc.close();
	}
}
