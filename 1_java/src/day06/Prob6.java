package day06;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		BookMgr bm = new BookMgr();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("=================");
			System.out.println("메뉴");
			System.out.println("1. 책 추가");
			System.out.println("2. 모든 책 제목 출력");
			System.out.println("3. 모든 책 가격 합");
			System.out.println("4. 종료");
			System.out.println("=================");
			
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch(menu) {
			case 1:
				System.out.print("제목 : ");
				String title = scanner.nextLine();
				System.out.print("가격 : ");
				int price = scanner.nextInt();
				scanner.nextLine();
				bm.addBook(new Book(title, price));
				break;
			case 2:
				System.out.println("=== 책 목록 ===");
				bm.printBookList();
				break;
			case 3:
				System.out.println("===책 가격의 총합===");
				bm.printTotalPrice();
				break;
			case 4:
				System.out.println("종료");
				scanner.close();
				bm = null;
				scanner = null;
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}

}
