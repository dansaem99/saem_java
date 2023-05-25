package ch05.ex03.case01;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isPower() { //boolean 타입의 getter는 is로 시작한다. 
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
}
