package myFirstJavaProject;
import  java.util.Scanner;
public class practiceCoding {

	public static void main(String[] args) {
		
		    // Create a Scanner input
		    Scanner input = new Scanner(System.in);  // Create a Scanner input
		    System.out.println("Enter username");

		    String userName = input.nextLine(); 
		    
		    System.out.println("Type your firstName");
		    String firstName = input.nextLine();
		    System.out.println("Type your lastName");
		    String lastName = input.nextLine();
		    System.out.println("Type your age");
		    int age = input.nextInt();
		    System.out.println("Type your salary");
		    double salary = input.nextInt();
		    
		    // Read user input
		    System.out.println("Username is: " + userName);
		    System.out.println("Username is: " + firstName);
		    System.out.println("Username is: " + lastName);
		    System.out.println("Username is: " + age);
		    System.out.println("Username is: " + salary);
		    
		    //operators
		    int a=10;  
		    int b=5;  
		    System.out.println(a+b);//15  
		    System.out.println(a-b);//5  
		    System.out.println(a*b);//50  
		    System.out.println(a/b);//2  
		    System.out.println(a%b);//0  
		    
		    
		    
		    

}}
