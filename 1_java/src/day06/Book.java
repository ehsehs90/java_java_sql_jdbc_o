package day06;

public class Book {
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
	
		
}
