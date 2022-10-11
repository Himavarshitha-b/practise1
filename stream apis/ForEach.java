ppackage streambasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FromList {
	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(39);
		numbers.add(100);
		
		Stream<Integer>numStreams = numbers.stream();
		
		numStreams.forEach(System.out::println);
		
		numStreams = numbers.stream().map((n)->n*n);
		numStreams.forEach(System.out::println);
		
		numbers.stream().map((n)->n*n).forEach(System.out::println);
		
		numbers.parallelStream().map((n)->n*n).forEach(System.out::println);
	}
}