package day07;

public class Test04 {

	public static void main(String[] args) {
		Fish f = new Fish("gupi");
		Dog d = new Dog();//"Jindo", "Happy");
		Animal j = new Animal("what");
		
		Animal a;
		a = f;
		a.print();
		a.breath();
		
		a = d;
		a.print();
		a.breath();
		
		a = j;
		a.print();
		a.breath();
	}

}
