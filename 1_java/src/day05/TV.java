package day05;

public class TV {
	boolean power;
	int size;
	int channel;
	String color;
	
	public void power() {
		this.power = !power;
	}
	
	public void channelUp() {
		this.channel++;
	}
	
	public void channelDown() {
		this.channel--;
	}
	
	public void print() {
		System.out.printf("TV[전원상태 : %b, 현재채널 : %d, 제품색상 : %s]\n"
				, this.power, this.channel, this.color);
	}
}
