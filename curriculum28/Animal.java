package curriculum28;

public class Animal {
	private String name;
	private String length;
	private String speed;
	private String technicalName;
	public String getName() {
		return this.name;
	}
	public String getLength() {
		return this.length;
	}
	public String getSpeed() {
		return this.speed;
	}
	public String getTechnicalName() {
		return this.technicalName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public void setTechnicalName(String technicalName) {
		this.technicalName = technicalName;
	}
	public void Animal(String length, String speed){
		setLength(length);
		setSpeed(speed);
		System.out.println("  	動物名：" + getName() + "\n"
				+ "	体長：" + getLength() + "m\n"
				+ "	速度：" + getSpeed() + "km/h\n"
				+ "	学名：" + getTechnicalName());
	}
}
