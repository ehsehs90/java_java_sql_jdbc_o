package day07;

public class Test03 {

	public static void main(String[] args) {
		Dog d = new Dog("Jindo", "Happy");
		Animal a = d;
		d.print();
		
		System.out.println(a.kind);
		System.out.println(d.kind);
		
		a.breath();
		d.breath();
		
	}

}
