package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	public static void main(String[] args) {
		System.out.println("Enter a double number: ");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + us.format(payment));


        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + india.format(payment));

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + china.format(payment));
        
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + france.format(payment));
    }
}
