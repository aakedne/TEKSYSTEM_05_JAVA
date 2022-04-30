package Functionalinterfaces;

public class sender {
	public void send(String message) {
		try {
			    Thread.sleep(50);
		}catch(Exception e) {
			System.out.println("Thread interrupted");
		}
		
	}

}
