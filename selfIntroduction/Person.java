package selfIntroduction;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private int count = 0;
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
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age, double height,double weight){
		setName(name);
		setAge(age);
		setHeight(height);
		setWeight(weight);
		print();
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	public void print() {
		count ++;
		System.out.println("名前は" + this.name +"です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi() + "です");
		System.out.println("合計" + this.count +"人です");
	}
	
}
