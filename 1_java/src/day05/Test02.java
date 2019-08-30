package day05;

public class Test02 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.color = "black";
		tv1.power();
		tv1.channelUp();
		
		TV tv2 = new TV();
		tv2.color = "red";
		
		System.out.println("----------------------");
		
		TV[] tvs;
		tvs = new TV[] {tv1, tv2, null, null, null};
		for(TV tv:tvs)if(tv != null)tv.print();
	}
}