package ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndList {

	public static void main(String[] args) {
	//	List<Integer> myNumberList;
		int sum = 0;
		ArrayList<String> myList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			myList.add(i);
			
		}
		
		for(String i : myList) {
				sum+=i;
		}
	    System.out.println("My sum " + sum);
	    
	    // java collection slide 22
	    myList.sort(x,y)) -> x.compareTo((y);
	    
	    List<Double> listOfDoubles = Arrays.asList(2.0,2.7,6.0,6.3);
	    System.out.println(lisOfDoubles.getClass().getName());
			
//		System.out.println(myList.indexOf(50));
//		System.out.println(myList.contains(80));
//		System.out.println(myList.contains(180));
//		boolean success = myList.remove((Integer)80);
//		System.out.println(success);
//		success = myList.remove((Integer)180);
//		System.out.println(success);
//		
//		System.out.println(myList.indexOf(80));
		
		
		}
		
	}



