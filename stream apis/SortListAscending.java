package sortcollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListAscending {

	public static void main(String[] args) {
		List<String>words = Arrays.asList("follow your heart, but take your brain with you".split(" "));
		
		words.stream().distinct().sorted().forEach(System.out::println);
		
		Comparator<String>sortReverseString = (str1, str2) -> str2.compareTo(str1);
		
		System.out.println("Reversed Order of String: ");
		
		words.stream().distinct().sorted(sortReverseString).forEach(System.out::println);
		
		System.out.println("Printing using forEachOrdered");
		
		words.stream().distinct().sorted().forEachOrdered(System.out::println);
	}
}