package code;

public class Consumer1 implements Runnable {
	private Q1 q;
	
	public Consumer1 (Q1 q) {
		this.q = q;
	} 

	public void run() {
		int i = 0;
		while (true) {
			i = q.get();
			if(i == 10){
				break;
			}
		}
	}

}