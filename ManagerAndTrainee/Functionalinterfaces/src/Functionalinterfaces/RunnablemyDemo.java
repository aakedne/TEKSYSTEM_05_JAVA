package Functionalinterfaces;

public class RunnablemyDemo implements Runnable{
	
	private Thread t;
	private String threadName;
	
	
	public RunnablemyDemo(String threadName) {
		
		this.threadName = threadName;
		System.out.println("Creating " +  threadName);
	}
	
	public void  run() {
		java.lang.String threadName;
		System.out.println("Running " +threadName);
		
		try {
			for(int i = 4; i >0; i--) {
				System.out.println("Thread: " +threadName + " , " + i);
				
				Thread.sleep(50);
			}catch(InterruptedException e) {
				System.out.println("Thread " + threadName + "Interrupted");
			}
			System.out.println("Thread " + threadName + "existing");
}
	public void start() {
		java.lang.String threadName = null;
		System.out.println("Starting " + threadName);
		if(t==null) {
			t = new Thread (this, threadName);
			t.start();
			
		}
	}
			
		}
