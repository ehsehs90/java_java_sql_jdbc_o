package day07;

public class Fish extends Animal {
	String name;
	
	public void print() {
		System.out.printf("Animal[%s, %s]\n", super.kind, name);
	}
	
	public Fish() {this("");}
	public Fish(String name) {
		super("Fish");
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println("아가미 호흡");
	}
	
}
