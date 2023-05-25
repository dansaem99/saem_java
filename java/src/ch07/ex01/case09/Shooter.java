package ch07.ex01.case09;

public class Shooter {
	private Gun gun; //디펜던시
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}