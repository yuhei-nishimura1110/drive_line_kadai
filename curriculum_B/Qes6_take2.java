package curriculum_B;

import java.util.Scanner;

public class Qes6_take2 {
	public static void main(String[] args) {
		System.out.println("検索する商品を入力してください"); 
		String list = new Scanner(System.in).nextLine();
		// 入力していただいた商品を分割する
		String[] lists = list.split("、");
		// forを回す
		for(String a:lists) {
			// switchを回す
			switch(a) {
			case "パソコン"->{
				// パソコンの台数を表示
				int i = new java.util.Random().nextInt(12);
				System.out.println(a + "の残り台数は"+ i + "台です");
			}
			case "冷蔵庫" ->{
				// 冷蔵庫の台数を表示
				int i = new java.util.Random().nextInt(12);
				System.out.println(a + "の残り台数は"+ i + "台です");
			}
			case "扇風機" ->{
				// 扇風機の台数を表示
				int i = new java.util.Random().nextInt(12);
				System.out.println(a + "の残り台数は"+ i + "台です");
			}
			case "洗濯機" ->{
				// 洗濯機の台数を表示
				int i = new java.util.Random().nextInt(12);
				System.out.println(a + "の残り台数は"+ i + "台です");
			}
			case "加湿器" ->{
				// 加湿器の台数を表示
				int i = new java.util.Random().nextInt(12);
				System.out.println(a + "の残り台数は"+ i + "台です");
			}
			case "テレビ","ディスプレイ"->{
				// テレビもしくはディスプレイの台数を表示
				int i = new java.util.Random().nextInt(12);
				System.out.println(a == "テレビ" ? "テレビ" : "ディスプレイ" +"の残り台数は"+i+"台です。");
			}
			default ->{
				// 
				System.out.println("『 その他商品 』は指定の商品ではありません");
			}
			}
		}
	}
}
