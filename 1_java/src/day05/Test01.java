package day05;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("이름을 입력해 주세요");
		System.out.println(data);
		
		String jumsu = JOptionPane.showInputDialog("국어/영어/수학 점수를 입력해 주세요");
		double m = 0;
		System.out.println(jumsu);
		for(String d:jumsu.split("/"))
			m += Integer.parseInt(d);
		System.out.println(m/3);
		
	}

}
