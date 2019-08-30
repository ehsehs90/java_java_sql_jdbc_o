package day10.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {

	public static void main(String[] args) {
		Set<Book> set = new TreeSet<Book>();
		
		set.add(new Book("java", 3000));
		set.add(new Book("sql", 1000));
		set.add(new Book("Spring", 5600));
		set.add(new Book("java", 3000));
		
		System.out.println(set);
		
		Iterator<Book> it = set.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			System.out.println(book);
			if(book.getTitle().equalsIgnoreCase("SqL")) {
				it.remove();
			}
		}
		System.out.println(set);
	}

}
