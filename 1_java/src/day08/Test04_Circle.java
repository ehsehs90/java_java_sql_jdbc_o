package day08;

public class Test04_Circle {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rect r = new Rect();
		
		exec(c);
		exec(r);
	}	
	
	public static void exec(ShapeManager obj) {
		obj.move();
		obj.draw();
	}
}
