package multithreading;

public class MultithreadTings extends Thread{
	
	private int threadNumber;
	
	public MultithreadTings(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		
		for (int i =0; i<5; i++) {
			System.out.println(i + " from thread "+ this.threadNumber);
			if (this.threadNumber == 3) {
				throw new RuntimeException ();
			}
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
			}
		}
		
	}

}
