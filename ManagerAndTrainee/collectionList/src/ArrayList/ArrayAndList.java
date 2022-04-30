package ArrayList;



import java.time.DayOfWeek;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.EnumMap;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;

import java.util.*;

public class ArrayAndList {

	private static final Iterator<String> Itr = null;

	public static void main(String[] args) {
//	//	List<Integer> myNumberList;
//		int sum = 0;
//		ArrayList<String> myList = new ArrayList<>();
//		for(int i = 0; i < 10; i++) {
//			myList.add(i);
//			
//		}
//		
//		for(String i : myList) {
//				sum+=i;
//		}
//	    System.out.println("My sum " + sum);
//	    
//	    // java collection slide 22
//	    myList.sort(x,y)) -> x.compareTo((y);
//	    
//	    List<Double> listOfDoubles = Arrays.asList(2.0,2.7,6.0,6.3);
//	    System.out.println(lisOfDoubles.getClass().getName());
//			
//		System.out.println(myList.indexOf(50));
//		System.out.println(myList.contains(80));
//		System.out.println(myList.contains(180));
//		boolean success = myList.remove((Integer)80);
//		System.out.println(success);
//		success = myList.remove((Integer)180);
//		System.out.println(success);
//		
//		System.out.println(myList.indexOf(80));
		
	    
	    
//		LinkedList<Integer> linkOne = new LinkedList<Integer>();
//		System.out.println(;linkOne.add(23));
//		linkOne.add(12);
//     	linkOne.add(4, 56);
//		linkOne.get(4);
//		linkOne.set(0, 98);
//		linkOne.indexOf(12);
//		linkOne.remove(3);
//		linkOne.size();
		
//		Map
		
//		EnumMap<DayOfWeek, Integer> map = new EnumMap<> (DayOfWeek.class);
//		map.put(DayOfWeek.FRIDAY, 23);
		
//		HashMap<Integer, String> cars = new HashMap<>();
//		
//		cars.containsValue(cars);
//		cars.containsKey(cars);
		
		
		HashSet<String> setHashList = new HashSet<String>();
		setHashList.add("one");
		setHashList.add("Two");
		setHashList.add("Erik");
		setHashList.add("Sara");
		setHashList.add("Two");
		
		Iterator<String> itr=setHashList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		

		
		
	}
		
	}



