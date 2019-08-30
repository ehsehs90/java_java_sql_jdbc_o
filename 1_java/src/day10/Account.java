package day10;

import java.io.Serializable;

/**
 * 
 * @author  student
 * @since   2019.05.08
 * @version 1.0
 *
 */

public class Account extends Object implements Serializable{
	private String num;
	private int money;
	
	public Account() {
		//this("000", 0);
	}

	public Account(String num) {
		//this(num, 0);
	}
	
	public Account(String num, int money) throws MoneyException {
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
	public void setMoney(int money) throws MoneyException{
		if(money < 0 )
			throw new MoneyException("음수");
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
	
	public static boolean transfer(Account from, Account to, int money) {
		if(from.output(money)) {
			to.input(money);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Account [num=" + num + ", money=" + money + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
	
	
}
