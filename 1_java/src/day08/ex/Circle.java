package day08.ex;

public class Circle extends Shape{
	private double radius;
	Circle(){}
	Circle(String name, double radius){
		super(name);
		setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius > 0)
			this.radius = radius;
	}
	@Override
	public void calculationArea() {
		area = radius*radius*Math.PI;
	}	
}
