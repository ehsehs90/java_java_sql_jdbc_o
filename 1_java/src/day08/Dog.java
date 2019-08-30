package day08;

public class Dog extends Animal{
	String kind;
	String name;
	
	public Dog() {this(null, null);}

	public Dog(String kind, String name) {
		super("Dog");
		this.kind = kind;
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println("폐 호흡");
	}
	
	@Override
	public void print() {
		System.out.printf("Animal[%s(%s), %s]\n", super.kind, this.kind, name);
	}
}