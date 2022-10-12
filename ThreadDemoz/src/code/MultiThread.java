package code;

public class MultiThread extends Thread {

	public MultiThread(String name){
		super(name);
	}
	
	public void run() {
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println("In " + Thread.currentThread().getName() + " " +i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}