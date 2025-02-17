package curriculum33;



public class Main {
	public static void main(String[] args) {
		//4
		Person person1 = new Person("森喜朗", 80, 1.7, 60);
		Person person2 = new Person("安倍", "晋三", 50, 1.5, 30);
		Car car = new Car();
		car.setOwner(person1.getName());
		Bicycle bicycle = new Bicycle();
		bicycle.setOwner(person2.getName());
		//5
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		person1.buy(car);
		person2.buy(bicycle);
	}
}
