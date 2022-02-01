package multithreading;

public class MultiThreading {
	
	public static void main(String[] args) {
		
		 for (int i=0; i<5; i++) {
			 MultithreadTings myThing = new MultithreadTings(i);
			 myThing.start();
		 }
		
		
	}
}
