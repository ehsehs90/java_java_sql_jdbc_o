package day07;

public class Animal {
	String kind;
	
	public Animal() {}
	
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void breath() {
		System.out.println("무 호흡");
	}
	
	public void print() {}
}

class Dog extends Animal{
	String kind;
	String name;
	
	public Dog() {this(null, null);}

	public Dog(String kind, String name) {
		super("Dog");
		this.kind = kind;
		this.name = name;
	}
	
	public void breath() {
		System.out.println("폐 호흡");
	}
	
	public void print() {
		System.out.printf("Animal[%s(%s), %s]\n", super.kind, this.kind, name);
	}
}