package code;

public class MultiThreadRunnable implements Runnable {
	@Override
	public void run() {//Contains thread logic.
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println("In " + Thread.currentThread().getName() + " " +i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread " + Thread.currentThread().getName() + " got interrupted..");
				return;
			}
		}
	}
}