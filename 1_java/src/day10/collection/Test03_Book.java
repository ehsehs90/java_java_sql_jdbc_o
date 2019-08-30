package day10.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Test03_Book {

	public static void main(String[] args) {
		//List<Book> list = new ArrayList<Book>();
		List<Book> list = new Vector<Book>();
		list.add(new Book("java", 3000));
		list.add(new Book("sql", 1900));
		list.add(new Book("DB", 9900));
		list.add(new Book("Spring", 5900));
		list.add(new Book("Spring", 5900));
		
		System.out.println(list);
		list.remove(new Book("sql", 1900));
		//Collections.sort(list);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle().charAt(0));
		}
	}

}

class Book implements Serializable, Comparable<Book> {
	private String title;
	private int price;
	
	public Book() {};
	
	public Book(String title, int price) {
		setTitle(title);
		setPrice(price);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title.length() > 0 || title != null) 
			this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 0) this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			return ((this.title.equals(((Book) obj).getTitle()) 
					&& (this.price == ((Book)obj).getPrice())));
		}
		return false;
	}

	@Override
	public int compareTo(Book b) {
		return this.price - b.price;
	}
	
	

}
