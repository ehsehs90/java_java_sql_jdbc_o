package day07.ex;

public class Teacher extends Person{
	private String subject;
	
	public Teacher() {}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(subject != null && subject.length() > 0)
			this.subject = subject;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("과목 : %s\n", subject);
	}
	
}
