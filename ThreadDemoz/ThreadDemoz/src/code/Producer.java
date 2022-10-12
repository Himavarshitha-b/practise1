package code;

public class Producer implements Runnable {
	private Q q;
	Producer (Q q) {
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