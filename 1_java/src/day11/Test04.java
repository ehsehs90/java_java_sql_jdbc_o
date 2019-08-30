package day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test04 {

	public static void main(String[] args) {
		String[] names = {"hong GD", "lee JK", "KO", "javains"};
		List<String> nn = Arrays.asList(names);
		
		nn.forEach(s->System.out.println(s.toUpperCase()));
		System.out.println("\n-----------------");
		
		nn
		.stream()
		.filter(i->i.length()>5)
		.forEach(i->System.out.print(i + "// "));
		System.out.println("\n-----------------");
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		.filter(i->i%2==0)
		.forEach(i->System.out.print(i + " "));
		System.out.println("\n-----------------");
		
	}

}
