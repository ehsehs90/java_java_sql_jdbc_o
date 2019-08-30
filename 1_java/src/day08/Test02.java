package day08;

public class Test02 {

	public static void main(String[] args) {
		Animal[] animals = {
				new Fish("Gupi", "Song"),
				new Dog("Jindo", "Happy")
		};
		
		for(Animal a:animals) {
			exec(a);
		}
	}
	
	public static void exec(Animal a) {
		a.print();
		a.breath();
	}
}
