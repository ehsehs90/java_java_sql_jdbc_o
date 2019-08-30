package play;

public class Test03 {
	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		
		NewObject.print();
		NewObject nobj = new NewObject();
		//System.out.println(nobj.toString());
		
	}
}

class NewObject extends Object{
	static int a;
	static {
		a = 3;
		System.out.println("static first");
	}
	static void print() {
		System.out.println(a);
	}
	public String toString() {
		return "this is NewObject";
	}
}
