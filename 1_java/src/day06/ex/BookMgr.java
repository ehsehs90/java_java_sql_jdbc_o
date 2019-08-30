package day06.ex;

public class BookMgr {
	private Book[] bookList;
	int count = 0;

	public BookMgr() {
		this(1);
	}
	public BookMgr(int n) {
		if(n <= 0) n = 1;
		bookList = new Book[n];
	}
	
	public void addBook(Book book) {
		if(count >= bookList.length) {
			Book[] temp = new Book[2*count];
			System.arraycopy(bookList, 0, temp, 0, count);
			bookList = temp;
		}
		bookList[count++] = book;
	}
	
	public void printBookList() {
		System.out.println("====== 책 목록 =======");
		for(int i = 0; i < count; i++) {
			System.out.printf("%s\n", bookList[i].getTitle());
		}
	}
	
	public void printTotalPrice() {
		System.out.println("==== 책 가격의 총합 ===");
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.printf("총합 : %d", sum);
	}

}
