package day08;

import day07.ex.Person;
import day07.ex.Student;

public class Test03 {

	public static void main(String[] args) {
		Object[] obj = {
				new Fish("Gupi", "Song"),
				new Dog("Jindo", "Happy"),
				new Student("홍길동", 28, "01")
		};
		
		for(Object a:obj) {
			exec(a);
		}
	}

	public static void exec(Object obj) {
		if(obj instanceof Animal)
			((Animal)obj).print();
		else if(obj instanceof Person)
			((Person)obj).print();
	}
}
