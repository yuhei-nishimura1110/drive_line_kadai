package selfIntroduction.in31;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private static int count = 0;
	private String lastName;
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	public static int getCount() {
		return Person.count;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setCount(int count) {
		Person.count = count;
	}
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age, double height,double weight){
		Person.count ++;
		setName(name);
		setAge(age);
		setHeight(height);
		setWeight(weight);
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	public void print() {
		
		System.out.println("名前は" + this.name +"です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi() + "です");
		
	}
	public static void printCount() {
		
		System.out.println("合計" + Person.getCount() +"人です");
	}
	
}
