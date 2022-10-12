package code;

public class Priorities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MultiThreadRunnable(),"First Thread");
		Thread t1 = new Thread(new MultiThreadRunnable(),"AnotherThread");
		
		t.start();
		t1.start();
		
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("In " + Thread.currentThread().getName() + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}