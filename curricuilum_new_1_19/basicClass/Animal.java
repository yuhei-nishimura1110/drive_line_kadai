package curricuilum_new_1_19.basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.name);
		Dog dog2 = new Dog(new java.util.Random().nextInt(100)+1);
		System.out.println(dog2.count);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'-'MM'-'dd' 'H':'m':'s");
		System.out.println(sdf.format(date));
	}
}
