package day10.ex;

public class MyStack {
	private int[] elements;
	private int count = 0;
	
	public MyStack() {
		this(10);
	}

	public MyStack(int size) {
		if(size < 0)size = 10;
		elements = new int[size];
	}

	public int getSize() {
		return count;
	}

	public boolean isEmpty() {
		return this.count == 0;
	}
	
	public boolean isFull() {
		return this.count == this.elements.length;
	}
	
	public void push(int element) {
		if(!this.isFull()) {
			elements[count++] = element;
		}
		else {
			int[] temp = new int[count*2];
			temp[count++] = element;
			elements = temp;
		}
	}
	
	public int top() {
		return elements[count-1];
	}
	
	public int pop() {
		if(this.isEmpty())return -1;
		return elements[--count];
	}
	

	
	

}
