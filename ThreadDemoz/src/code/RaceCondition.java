package code;

public class RaceCondition {
	public static void main(String[] args) {
		MyPrintServer mps = new MyPrintServer();
		
		Thread t1 = new Thread(new MyClient(mps,"Hello"));
		Thread t2 = new Thread(new MyClient(mps,"World"));
		
		t1.start();
		t2.start();
	}
}