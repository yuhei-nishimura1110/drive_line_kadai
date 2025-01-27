package curriculum_B;

import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		// パソコンの台数を決定する
		int pc = new java.util.Random().nextInt(12);
		// 冷蔵庫の台数を決定する
		int fridge = new java.util.Random().nextInt(12);
		// 扇風機の台数を決定する
		int fan = new java.util.Random().nextInt(12);
		// 洗濯機の台数を決定する
		int laundry = new java.util.Random().nextInt(12);
		// 加湿器の台数を決定する
		int humidifier = new java.util.Random().nextInt(12);
		// テレビ及びディスプレイの台数を決定する
		int TV = new java.util.Random().nextInt(12);
		// 名前、台数をひとまとめにする
		String bigDate = "パソコン,冷蔵庫,扇風機,洗濯機,加湿器,テレビ,ディスプレイ,"+pc+","+fridge+","+fan+","+laundry+","+humidifier+","+TV+","+TV;
		// ひとまとめにした名前台数を分割する
		String[] dateLists = bigDate.split(",");
		// データを貯蓄する配列を作る、疑似データベース
		String[][] date = new String[7][2];
		// この定数をつけないとdateListを上手く代入できないので数を数えるだけの定数を定義初期化
		int count = 0;
		// forを回す
		for(int j = 0; j < 2 ; j++) {
			// forを回す
			for(int i = 0; i < 7; i++) {
				// 代入する
				date[i][j]=dateLists[count];
				// 数を数えるだけの定数を++する
				count++;
			}
		}
		//ここまでがデータベース作り 
		
		//検索する商品を入力してもらう
		System.out.println("検索する商品を入力してください"); 
		String list = new Scanner(System.in).nextLine();
		// 入力していただいた商品を分割する
		String[] lists = list.split("、");
		// forを回す
		for(String a:lists) {
			// forを回す
			for(int i = 0;i < 8;i++) {
				// もし7列文探しても引っかからなかったら
				if(i==7) {
					// 商品がありませんと表示する
					System.out.println("『" + a + "』は指定の商品ではありません");
					// forを強制終了する
					break;
				}
				// 検索値とデータベース値の確認
				if(date[i][0].equals(a)) {
					// もし正しければ台数を表示して
					System.out.println(date[i][0] + "の残り台数は" + date[i][1] + "台です");
					// forを強制終了する。
					break;
				}
				
			}
		}
	}
}
