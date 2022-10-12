package code;
public class Consumer implements Runnable {
	private Q q;
	Consumer (Q q) {
		this.q = q;
	}

	public void run() {
		int i=0;
		while (i!=10) {
			i = q.get();
		}
	}
}