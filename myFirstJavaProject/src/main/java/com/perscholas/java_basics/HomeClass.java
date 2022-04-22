package com.perscholas.java_basics;

public class HomeClass {

	public static void main(String[] args) {
//	//Q1. declaring two integer variables
		int a, b;
	  // assigning values to them
		a = 3;
     	b = 6;
	 // assigning sum to them
		int total = a+b;
		System.out.println("The sum is " + total);
	
 // Q2. declaring two double variable
		double s, t;
	    s = 2.1;
	    t = 1.1;
	   
	    double myTotalValue = s + t;
	    System.out.println("The sum is " + myTotalValue);
		
// Q3.Integer variable and double variable, assign numbers to each other and add them. assign the sum
	    
	    int k;
	    double  h;
	    
	    k=3;
	    h=2.5;
	   
	    double Sum =k+h;
	    System.out.println("The sum is " + Sum);
    
// Q4. declare 2 int variables, assigns an int to each other, divide larger # by smaller #. assign the result to a a variable 
	   
	   
	 int c = 10;
	 int d = 2;
	 int e = c/d;
	 
	 System.out.println("output is " + e); // the output is 5
	 
	 double c2= 10.2;
	 double d2= 2;
	 double e2= c2/d2;
	 
	 System.out.println("output is " + e2); // the output is 5.1
	 
	 
// Q5. declare 2 double variables
	  
	double o2 = 13.2;
	double p2 = 3.0;
	double q2 = o2/p2;
	
	System.out.println(q2);
	
	int intValue =(int)q2;
	System.out.println(intValue);
	  
// Q6.  
	int x = 5;
	int y = 6;
	int q =y/x;
	
	System.out.println(q); // output is 0
	
	double Value = (double)q;
	System.out.println(Value); // output is 0.0
	
	
//Q7. 
	final int  v = 4;
	      byte r = 2;
	  System.out.println("result " + (v+r));
		
	
// 8. 
	double coffee = 2.5, subtotal, salesTax, orderTotal;
	
	double greentea = 3.5;
	double colddrink = 5.0;
	
	subtotal = 2 * coffee + 3 * greentea + 2 * colddrink;
	salesTax = 0.2 *subtotal;
	orderTotal = subtotal + salesTax;
	
	System.out.println("coffee:3@2.55\n;greantea:3@3.5\n colddrink:2@5\n subtotal:" + subtotal);
	System.out.println("\n orderTotal:" + orderTotal);
	
	
	
			
	}

}
