package code;

public class PrintServer {
		public /*synchronized */void output(String str){
			//synchronized(this){
			System.out.print("[");
			
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				System.out.println("Got Interrupted!!");
			}
			System.out.println(str+"]");
		//}
		}
		
		public synchronized void display(){
			System.out.println("Hello display.");
		}
		
		public void disp(){
			System.out.println("Inside disp.");
		}
		
		public static synchronized void out(){
			System.out.println("Inside static synchronized method");
		}
}