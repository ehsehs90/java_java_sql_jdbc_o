package day07.ex;

public class Person {
	private String name;
	private int age;
	
	
	public Person() {}
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name.length() > 0)
			this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0)
			this.age = age;
	}
	public void print() {
		System.out.printf("이름 : %3s   나이 : %3d   ", name, age);
	}
	
	
}
