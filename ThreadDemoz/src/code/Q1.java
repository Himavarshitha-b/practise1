package code;

public class Q1 {
	private int n;
	private boolean flag = false;

	synchronized int get() {
		if (flag==false)
		    try {
		          wait();//Inherited implicitly from the Object class.
	 	    }
		    catch (InterruptedException e) {
		          System.out.println("InterruptedException caught");
		    } 
		System.out.println( "Got: " + n + " in thread " + Thread.currentThread().getName());
		flag = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		if (flag==true)
		    try {
		          wait();
		    }
		    catch (InterruptedException e) {
		          System.out.println("InterruptedException caught");
		    } 
		this.n = n;
		flag = true;
	    	System.out.println( "Put: " + n); 
		notify();//Inherited implicitly from the Object class.
 	}
}