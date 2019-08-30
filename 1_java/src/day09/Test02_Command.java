package day09;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Test02_Command {

	public static void main(String[] args) {
		Command cmd = null;
		String msg = JOptionPane.showInputDialog(
				"Input Command. create, list, delete, update");
		if (msg != null)
			switch (msg.trim().toLowerCase()) {
			case "delete":
				cmd = new DeleteCommand();
				break;
			case "create":
				cmd = new CreateCommand();
				break;
			case "update":
				cmd = new UpdateCommand();
				break;
			case "list":
				cmd = new ListCommand();
				break;
			default:
				System.out.println(msg + " is not defined Command");
			}
		if (cmd != null) {
			cmd.exec();
			cmd.process();
		}
		
		Calendar cal = Calendar.getInstance();
		
		
	}

}
