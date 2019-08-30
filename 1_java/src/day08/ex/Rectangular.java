package day08.ex;

public class Rectangular extends Shape {
	private double width;
	private double height;
	Rectangular(){}
	Rectangular(String name, double width, double height){
		super(name);
		setWidth(width);
		setHeight(height);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width > 0)
			this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height > 0)
			this.height = height;
	}
	@Override
	public void calculationArea() {
		area =  width*height;
	}
}
