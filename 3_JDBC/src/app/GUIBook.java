package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.border.Border;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

public class GUIBook {
	
	BookDAO dao = new BookDAO();
	BookService service = new BookServiceImpl(dao);
	
	Frame f = null;
	TextArea ta = null;
	TextField title, price, author;
	Button list, insert;
	
	public GUIBook() {
		f = new Frame("Book App");
		ta = new TextArea(10, 1);
		f.add(ta, BorderLayout.NORTH);
		
		list = new Button("LIST");
		insert = new Button("INSERT");
		
		
		Panel p = new Panel();
		p.add(list);
		p.add(insert);
		
		f.add(p, BorderLayout.SOUTH);
		
		f.setSize(500, 400);
		f.setVisible(true);
		
		list.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<BookVO> data = service.bookList();
				data.forEach(b->ta.append(b.toString()+"\n"));
			}
		});
		
	}

	public static void main(String[] args) {
		new GUIBook();
	}

}
