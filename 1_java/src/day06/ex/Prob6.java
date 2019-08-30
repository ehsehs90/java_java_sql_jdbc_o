package day06.ex;

public class Prob6 {

	public static void main(String[] args) {
		BookMgr bm = new BookMgr(0);
		bm.addBook(new Book("java", 7600));
		bm.addBook(new Book("sql", 6600));
		bm.addBook(new Book("ejb", 1600));
		bm.printBookList();
		bm.printTotalPrice();
	}

}
