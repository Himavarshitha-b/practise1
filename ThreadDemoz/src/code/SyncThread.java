package code;

public class SyncThread implements Runnable {
	private MyPrintServer t;
	private volatile String s;

	public SyncThread(MyPrintServer t, String s) {
		super();
		this.t = t;
		this.s = s;
	}

	@Override
	public void run() {
		t.output(s);
	}
}