package day09.inner;

import javax.swing.JOptionPane;

import day09.Command;

public class Test02 {

	public static void main(String[] args) {
		Command delete = () -> System.out.println("DeleteCommand");
		Command update = () -> System.out.println("UpdateCommand");
		Command create = () -> System.out.println("CreateCommand");
		Command list = () -> System.out.println("ListCommand");
		
		String msg = JOptionPane.showInputDialog(
				"Input Command. create, list, delete, update");
		
		if(msg != null)
		switch (msg.trim().toLowerCase()) {
		case "delete":
			delete.exec();
			break;
		case "create":
			create.exec();
			break;
		case "update":
			update.exec();
			break;
		case "list":
			list.exec();
			break;
		default:
			System.out.println(msg + " is not defined Command");
		}
		
	}

}
