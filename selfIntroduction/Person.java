package selfIntroduction;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private int count = 0;
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
	public int getCount() {
		return this.count;
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
		this.count = count;
	}
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age, double height,double weight){
		this.count ++;
		setName(name);
		setAge(age);
		setHeight(height);
		setWeight(weight);
	}
	Person(String firstName,String lastName,int age, double height,double weight){
		this.count ++;
		setName(firstName + lastName);
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
	public void printCount() {
		
		System.out.println("合計" + this.count +"人です");
	}
	
}
