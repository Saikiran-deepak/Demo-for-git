package Methods;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class GetNumberInstance {
	public static void main(String[] args) throws Exception {
		Country();
		AllCountry();
	}

	public static void Country() {
		// Get the number instance
		NumberFormat nF = NumberFormat.getNumberInstance();

		// Sets the currency to Canadian Dollar
		nF.setCurrency(Currency.getInstance(Locale.JAPAN));

		// Stores the values
		String values = nF.getCurrency().getDisplayName();

		// Prints the currency
		System.out.println(values);
	}
	
	public static void AllCountry() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
//		NumberFormat nF = NumberFormat.getNumberInstance(Locale.UK);
//		String values=nF.getCurrency().getDisplayName();
//		System.out.println(values);
		
//		NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
//		String india=inFormat.format(payment);
//      System.out.println(india);
        
   
		
	}
}