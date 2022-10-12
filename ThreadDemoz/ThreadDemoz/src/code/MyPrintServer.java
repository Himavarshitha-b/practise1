package code;

public class MyPrintServer {
	
	public  synchronized  void output(String str){
	//synchronized(this){
		System.out.print("[");
		
		try{
			Thread.sleep(500);//This is the minimum time, it will sleep
			//& not the exact time, it will sleep.
		}catch(InterruptedException ie){
			System.out.println("Got Interrupted!!");
		}
		System.out.println(str+"]");
	//}//Equivalent to synchronized method.
	}
	
	public synchronized void display(){
		System.out.println("Hello display.");
	}
	
	public void disp(){
		System.out.println("Inside disp.");
	}
	
	public static void outPrint(){
		System.out.println("In outPrint");
	}
	
	public static synchronized void out(){
		System.out.println("Inside static synchronized method");
	}
}