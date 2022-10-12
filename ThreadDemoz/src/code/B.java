package code;

public class B {
    public /*synchronized*/ void methodB(A a) {
    	
    	synchronized(this){
    		String name = Thread.currentThread().getName();
    		System.out.println(name + " entered B.methodB");
    		try {
    				Thread.sleep(1000);
    		} catch (Exception e) {
                System.out.println("B Interrupted");
    		}
    		System.out.println(name + " trying to call A.last()");
    	}
    	synchronized(a){
    		a.last();
    	}
    }

    public /*synchronized*/ void last() {
        System.out.println("Inside B.last");
    }
}