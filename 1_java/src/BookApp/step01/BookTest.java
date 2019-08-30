package BookApp.step01;

import java.io.File;

public class BookTest {

	public static void main(String[] args) {
		BookMgr bookMgr = new BookMgr(new File("bookdata.txt"));
		bookMgr.saveBook("copy.txt");
	}

}
