package code;

public class Producer1 implements Runnable {
	private Q1 q;
	
	Producer1 (Q1 q) {
		this.q = q;
	}
	
	public void run() {
		int i = 1; 
		while (i<=10) {
			q.put (i);
			i++;
		}
	}
	
}