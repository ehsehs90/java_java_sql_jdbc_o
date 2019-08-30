package day08;

public abstract class Animal {
	String kind;
	
	public Animal() {}
	
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public abstract void breath();
	
	public abstract void print();
}