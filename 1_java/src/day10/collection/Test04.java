package day10.collection;

import java.util.HashSet;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) throws InterruptedException {
		
		Set<Book> set = new HashSet<Book>();
		Book b = new Book("java", 3000);
		Book c = new Book("java", 3000);
		
		
		set.add(b);
		set.add(c);
		 
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		System.out.println(set);
		
/*
		System.out.println(set.add(new Book("java", 3000)));
		System.out.println(set.add(new Book("java", 3000)));
		System.out.println(set.add(new Book("java", 3000)));
		*/
		/*
		set.add(new Book("sql", 3000));
		set.add(new Book("spring", 3000));
		set.add(new Book("java", 3000));
		set.add(new Book("java", 3000));
		*//*
		Set<Integer> set = new HashSet<Integer>();
		
		Integer a = new Integer(3);
		Integer b = new Integer("3");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
*/
		
		
			
		//System.out.println(set);
	}

}
