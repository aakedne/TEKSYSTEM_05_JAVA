package JavaLearning;

public class EnunTutorial {

	public static void main(String[] args) {
		
		DaysOfTheWeek day = DaysOfTheWeek.MONDAY; // printing specific day
		
		if(day == DaysOfTheWeek.MONDAY) {
			System.out.println("It is Monday");
		}
		
		for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){ // printing all days use for loop
			System.out.println(myDay);
		}

	}

}
