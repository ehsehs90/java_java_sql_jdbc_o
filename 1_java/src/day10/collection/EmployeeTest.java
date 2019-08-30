package day10.collection;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		Employee<String> emp = new Employee<String>("홍길동", "20202");
		System.out.println(emp.number.substring(0, 4));
		
		Employee<Integer> emp2 = new Employee<Integer>("홍길동", 3);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("홍길동", 10.2);
		System.out.println(emp3);
		*/
		
		Employee<String, String> emp1 = 
				new Employee<String, String>("홍길동", "2019-001");
		System.out.println(emp1);
		Employee emp2 = new Employee();
		System.out.println(emp2);
	}

}
