package play;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIChat {
	
	Chatting c = new Chatting();

	Frame f = null;
	TextArea chat = null;
	TextField chatlog;
	Button enter;
	
	public GUIChat() {
		f = new Frame("Chat App");
		chat = new TextArea(1, 1);
		chatlog = new TextField();
		enter = new Button("ENTER");
		Panel p = new Panel();
		p.add(enter);
		
		
		//chat.enable(false);
		
		
		
		//f.add(chatlog);
		f.add(chat, BorderLayout.SOUTH);
		f.add(p, BorderLayout.EAST);
		
		f.setSize(500, 400);
		f.setVisible(true);
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.insertLog("noname", chat.getText());
			}
		});
	}
	
	public static void main(String[] args) {
		new GUIChat();
	}

}
