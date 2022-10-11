package streambasic;

public class SourceFromString {

	public static void main(String[] args) {
		"hello there".chars().forEach(c->System.out.println((char)c));
	}
}