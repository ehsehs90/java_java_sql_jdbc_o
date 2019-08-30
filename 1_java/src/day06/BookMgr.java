package day06;

public class BookMgr {
	private Book[] booklist;
	private int tail;
	
	public BookMgr() {
		this(100);
	};
	
	public BookMgr(int size) {
		booklist = new Book[size];
		tail = 0;
	}
	
	public void addBook(Book book) {
		booklist[tail++] = book;
	}
	
	public void printBookList() {
		for(int i = 0; i < tail; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice() {
		int sum = 0;
		System.out.print("전체 책 가격의 합 : ");
		for(int i = 0; i < tail; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println(sum);
	}
	
}
