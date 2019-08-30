package day11;

import java.util.ArrayList;
import java.util.List;

import day09.ex.Book;

public class Test05 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("java", 500));
		books.add(new Book("sql", 5200));
		books.add(new Book("servlet&js", 2500));
		books.add(new Book("html5", 1500));
		books.add(new Book("java", 500));
		books.add(new Book("java", 500));
		
		//books.forEach(i->System.out.println(i));
		
		books.stream().distinct().forEach(i->System.out.println(i));
		
		long count = books.stream().filter(i->i.getPrice() == 500).count();
		System.out.println(count);
		
		int sum = books.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println(sum);
		
	}

}
