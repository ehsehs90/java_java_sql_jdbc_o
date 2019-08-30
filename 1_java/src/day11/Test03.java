package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(77);
		list.add(97);
		list.add(76);
		list.add(87);
		list.add(49);
		
		list.forEach(t->System.out.print(t + " "));
		System.out.println("\n---------------");
		
		list.removeIf(i -> i%2==0);
		list.forEach(t->System.out.print(t + " "));
		System.out.println("\n---------------");
		
		list.replaceAll(i->i*10);
		list.forEach(t->System.out.print(t + " "));
		System.out.println("\n---------------");
	}

}
