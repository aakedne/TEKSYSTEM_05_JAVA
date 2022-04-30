package Functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;


@FunctionalInterface
interface AddMethod{
//	public void msg();
	public int add(int a, int b);
}



public class Main  {

	public static void main(String[] args) {
		// functional programming1 slide 3-6
		
		
		//StringJoiner
		
//		StringJoiner joinNames = new StringJoiner(",", "[","]");
//		
//		// The add method from the StringJoiner
//		joinNames.add("Erik");
//		joinNames.add("Brook");
//		joinNames.add("Yusuf");
//		joinNames.add("Sara");
//		
//		StringJoiner joinNames2 = new StringJoiner("-", "(",")");
//		joinNames2.add("Abdi");
//		joinNames2.add("Kedne");
//		
//		StringJoiner m = joinNames2.merge(joinNames2);
//		
//		System.out.println(m);
		
		// String Buffered
//		StringBuffer sb = new StringBuffer("core Java");
//		sb.append("True");
//		sb.insert(3,  " false");
//		sb.replace(0, 1, "jav");
//		sb.delete(0, 4);
//      sb.reverse();
//	System.out.println(sb);
	
	
//	Addmethod m = new AddMethod();
	

//	@Override
//	public void msg(String msg) {
//		System.out.println("Hello ");
//	
//	String say = "Hello";
//	
//	AddMethod me =()->{
//		System.out.println(say);
//		
//	};
//	me.msg();
	
	//with the method code block
//	AddMethod addOne = (a, b)->{
//		System.out.println(a+b);
//	};
//	addOne.add(35, 25)

	// make it one line 
//	AddMethod addOne = (a, b)->(a+b);
//		System.out.println(addOne.add(10,  40));
		
		//Lambda expression
		 // (prams) -> {
//		code block
//	}
//		(prams, prams) -> {
//			code block
//		}
		
		
//		List<String> listOne = new ArrayList<>();
//		listOne.add("Erik");
//	    listOne.add("Brook");
//		listOne.add("Yusuf");
//	    listOne.add("Sara");
//	    
//	    listOne.forEach((n)->System.out.println(n)
//	    		);
//	new Thread() -> start()-> run()         
		RunnablemyDemo runOne = RunnablemyDemo("Thread-1");
		runOne.start();

		
		RunnablemyDemo runTwo = RunnablemyDemo("Thread-2");
}

	
