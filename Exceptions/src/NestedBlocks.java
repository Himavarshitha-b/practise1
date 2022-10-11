
public class NestedBlocks {

	public static void main(String[] args)
	{
	     try {
	            try {

	 

	                int a[] = {10,20,30};
	                
	                for(int i = 0 ; i < 5 ; i++) {
	                    System.out.println(a[i]);
	                }
	                
	            } catch (ArrayIndexOutOfBoundsException ex) {
	                System.out
	                        .println("Inside Array Index Out of Bounds Exception");
	                int x = 10 / 0;
	                //throw new ArithmeticException("Don't divide by zero");
	            } finally {
	                System.out.println("finally of ArrayIndexOutOfBoundsException");
	            }
	        } catch (ArithmeticException ae) {
	            System.out.println("Inside ArithmeticException: " + ae.getMessage());
	        } finally {
	            System.out.println("finally of ArithmeticException");
	        }
	        System.out.println("Exit main");
	    }
	
	}


