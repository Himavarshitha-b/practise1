package code;

public class JoiningDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MultiThreadRunnable(), "First Thread");
		Thread t2 = new Thread(new MultiThreadRunnable(),"AnotherThread");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();//main thread will start/join after this thread.
			t2.join();//main thread will start/join after this thread.
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println("In " + Thread.currentThread().getName() + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}