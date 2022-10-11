package streambasic;
import java.util.Arrays;

public class SourceIntTerminateDemo {

	public static void main(String[] args) {
		Arrays.stream(new int[]{10,20,30,30,40})//Source
			  .map(num->num*num)//intermediate operation
			  .distinct()//intermediate operation
			  .sorted().//intermediate operation
			  forEach(System.out::println);//terminal operation
	}
}