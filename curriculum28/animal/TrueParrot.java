package curriculum28.animal;

import curriculum28.Animal;

public class TrueParrot extends Animal{
	public void Animal(String length, String speed){
		setName("インコ");
		setTechnicalName("不明");
		setLength(length);
		setSpeed(speed);
		System.out.println("  	動物名：" + getName() + "\n"
				+ "	体長：" + getLength() + "m\n"
				+ "	速度：" + getSpeed() + "km/h\n"
				+ "	学名：" + getTechnicalName());
	}
	
}