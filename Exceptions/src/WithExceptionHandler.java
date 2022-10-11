
public class WithExceptionHandler {

	public static void main(String[] args) {
		 int num = 0;
	        try {
	            //num = 10/5;//No Exception
	            num = 10 / 0;// Will cause exception.
	            System.out.println("Answer is: " + num);// Will not reach here, if
	                                                    // exception thrown
	        } catch (ArithmeticException ae) 
	        {// ae = new ArithException();
	            System.out.println("Exception handled here");
	        }
	        System.out.println("After handling exception... ");
	    }
	
// TODO Auto-generated method stub

	}


