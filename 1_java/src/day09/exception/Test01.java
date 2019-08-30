package day09.exception;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("start");
		String num = JOptionPane.showInputDialog("Input Number..");
		try {
			System.out.println(1);
			System.out.println(1/Integer.parseInt(num));
			System.out.println(2);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0 nono");
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("num format correctly");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println(9);
		}
		System.out.println("end");
		
	}

}
