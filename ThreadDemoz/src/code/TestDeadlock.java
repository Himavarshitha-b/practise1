package code;

class T1 implements Runnable {
	A a;
	B b;
	public T1(A a, B b){
		this.a = a;
		this.b = b;
	}
	
	public void run(){
		a.methodA(b);
	}
}

class T2 implements Runnable{
	A a;
	B b;
	
	public T2(A a, B b){
		this.a = a;
		this.b = b;
	}
	
	public void run(){
		b.methodB(a);
	}
}

public class TestDeadlock {
    public static void main(String args[]) {
    	A a = new A();
    	B b = new B();
    	
    	T1 t1 = new T1(a,b);
    	T2 t2 = new T2(a,b);
    	
    	Thread thr1 = new Thread(t1,"Thread1");
    	Thread thr2 = new Thread(t2,"Thread2");
    	
    	thr1.start();
    	thr2.start();
    }
}