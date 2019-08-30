package day10;

public class MoneyException extends Exception{
	public MoneyException() {
		super("MoneyException");
	}
	
	public MoneyException(String msg) {
		super(msg);
	}
}
