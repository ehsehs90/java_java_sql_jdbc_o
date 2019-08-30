package day05;

public class Account {
	private String account_num;
	private int money;
	
	public void setAccountNum(String num) {
		account_num = num;
	}
	
	public String getAccountNum() {
		return account_num;
	}
	
	public void inMoney(int money) {
		System.out.printf("[입금] [계좌번호 : %10s, 금액 : %10d, 잔고:%10d]\n", 
				this.account_num, money, this.money+money);
		this.money += money;
	}
	
	public void outMoney(int money) {
		if(this.money >= money) {
			System.out.printf("[출금] [계좌번호 : %10s, 금액 : %10d, 잔고:%10d]\n", 
					this.account_num, money, this.money-money);
			this.money -= money;
		}
		else {
			System.out.printf("[출금] [잔액이 부족합니다, 계좌번호 : %10s]\n", account_num);
		}
	}
	
	public void moveMoney(Account dest, int money) {
		if(this.money >= money) {
			System.out.printf("[계좌이체] [출금계좌 : %10s, 입금계좌 : %10s, 금액 : %10d, 잔고:%d]\n", 
					this.account_num, dest.getAccountNum(), money, this.money-money);
			dest.inMoney(money);
			this.outMoney(money);
		}
		else {
			System.out.printf("[계좌이체] [잔액이 부족합니다, 계좌번호 : %10s]\n", account_num);		}
	}
	
	public void printState() {
		System.out.printf("[계좌번호 : %10s, 잔고 : %10d]%n", account_num, money);
	}
}
