package Bank;

public class MultiThread {
	
	public static void main(String[] args) throws InterruptedException {
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		Worker w3 = new Worker();
		Worker w4 = new Worker();
		
		w1.start();

		w2.start();
//		w3.start();
//		w4.start();
		
		Thread r1 = new Thread(new TaskExecutor());
		Thread r2 = new Thread(new TaskExecutor());
		Thread r3 = new Thread(new TaskExecutor());
		
		r1.start();
//		r2.start();
//		r3.start();
		
//		synchronized(sharedResource) {
//			registerUser();
		}
	
}



//void registerUser() {
//	sharedResource.add("Test");
//}

class Worker extends Thread {
	
	public void run() {
		for (int i = 0; i < 4; i++ ) {
			System.out.println("Running thread ["+getName()+"]");
		}
	}
}
		
//		synchronized(sharedResource) {
//		registerUser();
//	}

	
//	void registerUser() {
//		sharedResource.add("Test");
//	}
//
class TaskExecutor implements Runnable {

	@Override
	public void run() {
		System.out.println("Running thread 2...");
		
	}

}
//
//void registerUser() {
//	
//}