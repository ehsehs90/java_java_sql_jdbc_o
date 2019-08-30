package app;

import java.util.List;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

public class BookApp {
	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);
		BookVO vo = new BookVO("test2", null, 5600);
		if(service != null) {
			try {
				System.out.println(service.addBook(vo));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<BookVO> list = service.bookList();
			list.forEach(i->System.out.println(i));
		}
	}
}
