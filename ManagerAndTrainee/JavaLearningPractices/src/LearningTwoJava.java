import java.text.NumberFormat;

public class LearningTwoJava {

	private static double number;

	public static void main(String[] args) {

// Format numbers in Java
	//	 formating in numbers
		NumberFormat currency = NumberFormat.getCurrencyInstance(); // instantiate and return
		String result = currency.format(number = 1234567.891);
		System.out.println(result);
		
		// format numbers in percentage 
		NumberFormat percent = NumberFormat.getPercentInstance(); // instantiate and return
		String result = percent.format(number = 0.1);
		System.out.println(result);
		
//		
		
		
		
		
	}

}
