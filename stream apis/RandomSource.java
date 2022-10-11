package streambasic;
import java.util.Random;

public class RandomSource {

	public static void main(String[] args) {
		System.out.println("Random order:");
		//This is an updation in Java 8, of the class Random
		new Random().ints().limit(10).forEachOrdered(System.out::println);
		System.out.println("Random order of long:");
		new Random().ints().asLongStream().limit(4).forEach(System.out::println);
	}
}