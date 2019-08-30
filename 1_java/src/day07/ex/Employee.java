package day07.ex;

public class Employee extends Person{
	private String dept;

	public Employee() {}

	public Employee(String name, int age, String dept) {
		super(name, age);
		setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		if(dept != null && dept.length() > 0)
			this.dept = dept;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("부서 : %s\n", dept);
	}
	
	
}
