package code;

public class A {
    public /*synchronized*/ void methodA(B b) {
    	synchronized(this){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.methodA");
        try {
                Thread.sleep(1000);
        } catch (Exception e) {
                System.out.println("A Interrupted");
        }
        System.out.println(name + " trying to call B.last()");
    	}
    	
    	synchronized(b){
    		b.last();
    	}
    }

    public /*synchronized*/ void last() {
        System.out.println("Inside A.last");
    }
}