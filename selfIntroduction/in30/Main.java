package selfIntroduction.in30;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
	    System.out.println(person1.getName());
	    System.out.println(person1.getAge());
	    System.out.println(person1.getHeight());
	    System.out.println("");
		person1.print();
		System.out.println("");
		person1.printCount();
	}  
}