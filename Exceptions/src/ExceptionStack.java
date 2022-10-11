public class ExceptionStack {
    public static int computeDivision(int num, int divisor) {
        System.out.println("Computing division");
        return num / divisor;
    }
    public static void printDivision(int num, int divisor) {
        int answer = computeDivision(num, divisor);
        System.out.println("Division is: " + answer);
        System.out.println("Exit printDivision");
    }
    public static void main(String[] args) {
        try {
            int num = 10;
            int divisor = 0;// Change to zero for observing exceptions.
            printDivision(num, divisor);// No Exception
            System.out.println("Exit main");// Will not reach here, if exception
                                            // thrown
        } catch (ArithmeticException ae) {
            System.out.println("Exception being handled in main");
            ae.printStackTrace();
        } finally {
            System.out.println("In finally of main...");
        }
    }
}
