package day04;

public class Test04 {

	public static void main(String[] args) {
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		for(String str:strData) {
			for(int i = str.length()-1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}

}
