package day08;

public class Fish extends Animal {
	String kind;
	String name;
	
	public Fish() {this("", "");}
	
	public Fish(String kind, String name) {
		super("Fish");
		this.kind = kind;
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println("아가미 호흡");
	}
	
	@Override
	public void print() {
		System.out.printf("Animal[%s(%s), %s]\n", super.kind, this.kind, name);
	}
	
}
