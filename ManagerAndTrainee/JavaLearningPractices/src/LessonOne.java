import java.util.Arrays;

public class LessonOne {

	public static void main(String[] args) {
		//Array is used to store list of items/people
		// arrays start 0 and have a certain number
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		
//		// another way to do java arrays are
	
		int[] numbers = {3,5,7,9,13};
		Arrays.sort(numbers);	
		System.out.println(Arrays.toString(numbers));
		

		
// Multi dimensional arrays
// adding another dimension, add another bracket on both sides
		
		int[][] numbers = new int [2][3];
		numbers [0][0] = 1;
		System.out.println(Arrays.deepToString(numbers));
		

// constant or final variable
		final float pi = 3.14f;
		System.out.println(pi);
		
// Arithmetic Expression 
// we have +, -, * and / and %.
		int result = 10 + 3;
		System.out.println(result);
	
		int result = 10 / 3;
		System.out.println(result);
		
		// casting	
		double result = (double) 10 / (double) 3;
		System.out.println(result);
		
// increment and decrement-- increasing by 1
		int x = 1;
		   x++;       // ++x // x=x+2
		System.out.println(x); 
		
		
// order of operation are (), *, / - and +.
		int x = 10 + 3 *2; // 
		System.out.println(x);
		
	// if you want to evaluate the parenthesis use brackets
		int x = (10 + 3) *2;
		System.out.println(x);
		
		
// Casting 
		// implicit casting or automatic convention
		// byte>short>int>long>float>double. it can only has numbers not string
		short x =1;
		int y = x + 2;
		System.out.println(y);

		//explicit casting 
		double x = 1.1;
		int y = (int)x + 2;
		System.out.println(y);
		
		String x = "1";
		int y = Integer.parseInt(x) + 2;
		System.out.println(y);
		
		
		
// Math class
	int result = Math.round(1.1F);
		System.out.println(result);
		
		int result = (int) Math.ceil(1.1F); //casted
		System.out.println(result);
		
		int result = (int) Math.floor(1.1F); //largest number
		System.out.println(result);
		
		
		
		

	}

}
