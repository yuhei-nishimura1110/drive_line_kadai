package curriculum23;

public class Lion {
	private String name = "ライオン";
	private double bodyLenght = 2.1;
	private int speed = 80;
	// ゲッターを生成
	public String getName() {
		return this.name;
	}
	public double getBodyLenght() {
		return this.bodyLenght;
	}
	public int getSpeed() {
		return this.speed;
	}
	// セッターを生成
	public void setName(String name) {
		this.name = name;
	}
	public void setBodyLenght(double bodyLenght) {
		this.bodyLenght = bodyLenght;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
