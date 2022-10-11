package sortcollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListDescending {

	public static void main(String[] args) {
		List<String>words = Arrays.asList("follow your heart, but take your brain with you".split(" "));
		
		Comparator<String>sortReverseString = (str1, str2) -> str2.compareTo(str1);
		
		words.stream().distinct().sorted(sortReverseString).forEach(System.out::println);

		words.stream().distinct().sorted().forEach(System.out::println);
	}
}