package ch05.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Gun gun = new Gun();
		Shooter shooter = new Shooter();
		
		shooter.setGun(gun);
		shooter.fire();
	}
}