package code;

public class MyClient implements Runnable{
	private MyPrintServer t;
	private String s;

	public MyClient(MyPrintServer t, String s) {
		super();
		this.t = t;
		this.s = s;
	}

	@Override
	public void run() {
		t.output(s);
	}
}