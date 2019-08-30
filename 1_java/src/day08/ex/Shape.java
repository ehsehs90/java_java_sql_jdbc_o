package day08.ex;

public abstract class Shape {
	protected double area;
	private String name;
	
	public Shape() {}
	public Shape(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name.length() > 0)
			this.name = name;
	}
	
	public double getArea() {
		return area;
	}

	public abstract void calculationArea();
	
	public void print() {
		System.out.printf("%s의 면적은 %f\n", name, area);
	}
	
}
