package Main;

import java.util.Scanner;

public class ExceptionsAccount {

	public static void main(String[] args) {

	    Scanner userInPut = new Scanner(System.in);

	    System.out.println("Enter a 5 digit number: ");
	        int digit = userInPut.nextInt();

	        while(digit > 1000 || digit < 100)
	            {           
	             System.out.println("Error! Please enter a 3 digit number: ");
	             digit = userInPut.nextInt();
	            }

	        System.out.println(digit);

	}

}
