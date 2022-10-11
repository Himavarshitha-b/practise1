
public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
        try {
            //num = 10 / 5;// No Exception
            num = 10 / 0;// Will cause exception.
            System.out.println("Answer is: " + num);// Will not reach here, if
                                                    // exception thrown
        }catch (ArithmeticException ae) {
            System.out.println("Exception handled here: " + ae.getMessage());
        }finally {
            System.out.println("Inside finally");
        }
        System.out.println("After handling exception... ");
    }
	}


