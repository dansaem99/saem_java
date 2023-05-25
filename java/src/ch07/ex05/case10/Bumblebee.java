package ch07.ex05.case10;

public class Bumblebee implements Autobot {
	@Override
	public void run() {
		System.out.println("범블비 달리다.");
	}
	
	@Override
	public void fight() {
		System.out.println("범블비 싸우다.");
	}
	
	public void guard() {
		System.out.println("범블비 보호하다.");
	}
}
