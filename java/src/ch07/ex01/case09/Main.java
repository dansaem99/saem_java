package ch07.ex01.case09;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		
		shooter.setGun(new Pistol());
		shooter.fire();
		
		shooter.setGun(new Rifle());
		shooter.fire();
	}
}