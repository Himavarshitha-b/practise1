package streambasic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		/*
		 * IntStream .rangeClosed(1, 10) .filter(i-> (i%2)==0)//Intermediate operation
		 * .forEach(System.out::println);
		 */
		
		List<Integer>integers = new ArrayList<>();
		
		integers.add(89);//a
		integers.add(2);//b
		integers.add(36);
		integers.add(41);
		integers.add(5);
		//integers.clear();
		Optional<Integer> result = integers.stream().reduce((a,b)->a*b);
		//1 * 2 = 2 = a
		//b = 3. So, 2 * 3 = 6 = a
		//b = 4. So, 6 * 4 = 24 = a
		//b = 5. So, 24 * 5 = 120
		
		if(result.isPresent()) {
			System.out.println(result.get());
		}else {
			System.out.println("Stream was empty");
		}
		
		System.out.println("Ascending order:");
		
		integers.stream().sorted().forEach((n)->System.out.println(n));
		
		System.out.println("Descending order:");
		
		integers.stream().sorted(Collections.reverseOrder()).forEach((n)->System.out.println(n));
	}
}