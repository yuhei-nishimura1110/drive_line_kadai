package curriculum28.animal;

import curriculum28.Animal;

public class Zebra extends Animal{
	public void Animal(String length, String speed){
		setName("シマウマ");
		setTechnicalName("チャップマンシマウマ");
		setLength(length);
		setSpeed(speed);
		System.out.println("  	動物名：" + getName() + "\n"
				+ "	体長：" + getLength() + "m\n"
				+ "	速度：" + getSpeed() + "km/h\n"
				+ "	学名：" + getTechnicalName());
	}
	
}