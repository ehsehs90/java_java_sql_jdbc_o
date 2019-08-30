package day05;

public class TestAssign {

	public static void main(String[] args) {
		Account ac1 = new Account();
		Account ac2 = new Account();
		
		ac1.setAccountNum("12323321");
		ac2.setAccountNum("99532422");
		ac1.inMoney(30000);
		ac1.moveMoney(ac2, 5000);
		ac1.outMoney(30000);
		ac1.printState();
		ac2.printState();
		
		
	}

}
