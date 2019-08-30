package play;

import java.util.Vector;

public class ClassTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Object obj = null;
		Class c = Class.forName("java.util.Vector");
		obj = c.newInstance();
		
		if(obj instanceof Vector) {
			System.out.println("ok");
		}
		else {
			System.out.println("no");
		}
	}

}

