package ch05.home.ex05.case06;

public class Man {
	private String manName;
	private Money money;
	private Phone phone;
	
	public void buy() {}
	public void msg() {
		phone.msg();
	}
	
	public void game() {
		phone.game();
	}
	
	public void call() {
		phone.call();
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}
