package day08;

public interface Movable {
	public void move();
}

interface Drawable{
	void draw();
}

interface ShapeManager extends Movable, Drawable{
	public static final int a = 3;
}

class Circle implements ShapeManager{
	@Override
	public void move() {
		System.out.println("Circle Move");
	}
	
	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
}

class Rect implements ShapeManager{
	@Override
	public void move() {
		System.out.println("Rect Move");
	}
	
	@Override
	public void draw() {
		System.out.println("Rect Draw");
	}
}