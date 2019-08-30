package day07.ex;

public class Test02 {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("Hail", 28, "2015");
		Teacher t = new Teacher("Searom", 25, "English");
		Employee e = new Employee("Yunjeong", 20, "Design");
		
		/*
		p = s;
		p.print();
		
		p = t;
		p.print();
		
		p = e;
		p.print();
		*/
		personPrint(s);
		personPrint(t);
		personPrint(e);
	}
	
	public static void personPrint(Person p) {
		p.print();
	}

}
