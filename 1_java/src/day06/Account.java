package day06;

/**
 * 
 * @author  student
 * @since   2019.04.30
 * @version 1.0
 *
 */

public class Account {
	private String num;
	private int money;
	
	public Account() {
		this("000", 0);
	}

	public Account(String num) {
		this(num, 0);
	}
	
	public Account(String num, int money) {
		setNum(num);
		setMoney(money);
	}


	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		if(num != null && num.length() > 0)
			this.num = num;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money > 0 )
			this.money = money;
	}
	
	public void input(int money) {
		if(money > 0)
			this.money += money;
	}
	
	public boolean output(int money) {
		if(money > 0 && this.money >= money) {
			this.money -= money;
			return true;
		}
		System.out.println("잔고 부족");
		return false;
	}
	
	public void print() {
		System.out.printf("Account[통장번호 : %20s, 잔고 : %10d 원]\n", num, money);;
	}
	
	/**
	 * 
	 * @param from  보내는 계좌
	 * @param to	받는 계좌
	 * @param money	이체 금액
	 * @return
	 */
	public static boolean transfer(Account from, Account to, int money) {
		if(from.output(money)) {
			to.input(money);
			return true;
		}
		return false;
	}
	
	
}
