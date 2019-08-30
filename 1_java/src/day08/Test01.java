package day08;

import static java.lang.Math.*;


public class Test01 {

	public static void main(String[] args) {
//		System.out.println(PI);
//		System.out.println(random());
		
		Fish f = new Fish("Gupi", "Song");
		Dog d = new Dog("Jindo", "Happy");
		
		exec(f);
		exec(d);
		
	}
	
	public static void exec(Animal f) {
		f.print();
		f.breath();
	}
}
