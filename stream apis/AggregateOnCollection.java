package streambasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AggregateOnCollection {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		int a[] = {12,67,65};
		numbers.add(10);
		numbers.add(39);
		numbers.add(100);

		long count = numbers.stream().count();
		System.out.println(count);
		
		int sum = IntStream.of(a).sum();
		System.out.println(sum);
	}
}