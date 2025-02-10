package curriculum28;

import curriculum28.animal.Chimpanzee;
import curriculum28.animal.Default;
import curriculum28.animal.Elephant;
import curriculum28.animal.Lion;
import curriculum28.animal.Panda;
import curriculum28.animal.TrueParrot;
import curriculum28.animal.Zebra;

public class Qes28Main {
	public static void main(String[] args) {
		System.out.println("入力してください");
		String sys = new java.util.Scanner(System.in).nextLine();
		String[] animals = sys.split(",");
		for(String ani:animals) {
			String[] element = ani.split(":");
			Animal animal = new Animal();
			switch(element[0]) {
			case "ライオン" ->{
				animal = new Lion();
			}
			case "ゾウ" ->{
				animal = new Elephant();
			}
			case "パンダ" ->{
				animal = new Panda();
			}
			case "チンパンジー" ->{
				animal = new Chimpanzee();
			}
			case "シマウマ" ->{
				animal = new Zebra();
			}
			case "インコ" ->{
				animal = new TrueParrot();
			}
			default ->{
				animal = new Default();
			}
			}
			animal.Animal(element[1],element[2]);
			System.out.println("");
		}
	}
}
