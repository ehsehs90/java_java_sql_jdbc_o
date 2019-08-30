package day09;

public class Test01 {

	public static void main(String[] args) {
		Object msg1 = "hello java";
		Object msg2 = "hello java";
		
		System.out.println(msg1);
		System.out.println(msg2);

		Object emp1 = new Employee("홍길동", "기술부");
		Object emp2 = new Employee("홍길동", "기술부");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println("msg1 equal msg2 " + msg1.equals(msg2));
		System.out.println("emp1 equal emp2 " + emp1.equals(emp2));
	}

}
