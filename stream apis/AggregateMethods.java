package streambasic;
import java.util.stream.IntStream;

public class AggregateMethods {

	public static void main(String[] args) {
		int sum = IntStream.of(10,20,30,40,50).sum();
		System.out.println("Sum: " + sum);
		
		long count = IntStream.of(10,20,30,40,50).count();
		System.out.println("Count: " + count);
	}
}