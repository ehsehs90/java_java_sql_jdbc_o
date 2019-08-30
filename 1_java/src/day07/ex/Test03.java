package day07.ex;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Person[] p = {
				new Student("최길동", 13, "01"),
				new Student("김길동", 15, "02"),
				new Teacher("이선생", 26, "수학")
		};				

		
		
		/*
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		String var;
		int select;
		int count = 0;
		
		for(int i = 0; i < 10; i++, count++) {
			System.out.println("1.stu 2.tea 3.emp");
			select = scanner.nextInt();
			scanner.nextLine();
			if(select == -1)break;
			
			System.out.print("이름 : ");
			name = scanner.nextLine();
			
			System.out.print("나이 : ");
			age = scanner.nextInt();
			scanner.nextLine();
			
			switch(select) {
			case 1:
				System.out.print("학번 : ");
				var = scanner.nextLine();
				p[i] = new Student(name, age, var);
				break;
			case 2:
				System.out.print("과목 : ");
				var = scanner.nextLine();
				p[i] = new Teacher(name, age, var);
				break;
			case 3:
				System.out.print("부서 : ");
				var = scanner.nextLine();
				p[i] = new Employee(name, age, var);
				break;
			default:
				break;
			}
		}
		*/
		
		
		for(int i = 0; i < p.length; i++) {
			if(p[i] instanceof Student) {
				System.out.print(((Student)p[i]).getId());
				System.out.println(p[i].getName().charAt(0)+"**");
			}
		}
		
	}
	
	public static void personPrint(Person p) {
		p.print();
	}

}
