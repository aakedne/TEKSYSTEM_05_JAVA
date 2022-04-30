package CollectionPractice;

import java.util.HashMap;

public class CollectionPracticeOne {

	public static void main(String[] args) {
		HashMap<String, Integer> empIds = new HashMap<>();
		
		//use put to add key and value. 
		empIds.put("Abdi", 1234);
		empIds.put("Adow", 5647);
		empIds.put("Ibrahim", 654);
		
		System.out.println(empIds);
		
		// use get to print the ID of each employee
		System.out.println(empIds.get("Abdi"));
		
		// use to containKey to check if empIds exists
	
		System.out.println(empIds.containsKey("Abdi"));
		
		//use containsValue to see if the map contains certain value
		System.out.println(empIds.containsValue(6));
		
		//updates certain value
		empIds.put("Abdi", 90353);
		System.out.println(empIds);
		
		// replace only replaces existing value
		empIds.replace("Adow", 8007);
		System.out.println(empIds);

		//Use putIfAbsent to add a key not existing
		empIds.putIfAbsent("Steve", 4445);
		System.out.println(empIds);
		
		// use remove to take values off
		empIds.remove("Steve");
		System.out.println(empIds);
		
	}

}
