package day07.ex;

public class Student extends Person {
	private String id;

	public Student() {}

	public Student(String name, int age, String id) {
		super(name, age);
		setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id != null && id.length() > 0)
			this.id = id;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("학번 : %s\n", id);
	}
	
	
}
