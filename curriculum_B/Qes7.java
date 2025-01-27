package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		// 人数を宣言初期化ココでしないとwhileの条件に入れられないためココで宣言
		int menber = 0;
		System.out.println("採点する人数を入力してください。");
		// whileを回す
		while(menber < 2) {
			// 人数を入れてもらう
			menber = new Scanner(System.in).nextInt();
			// 2未満であれば
			if(menber < 2) {
				// 2以上の数字を入力してくださいと表示してループ
				System.out.println("2以上の数値を入力してください。");
			}
		}
		// サブジェクト配列を作っておく
		String[] subject = {"英語","数学","理科","社会"};
		// 人数に合わせて配列を作る
		int[][] date = new int[menber][4];
		// forを回す
		for(int i = 0;i<menber;i++) {
			// forを回す
			for(int j = 0;j<4;j++) {
				// i+1人目のsubject[j]教科の点数を入力くしてもらう
				System.out.println(i+1 + "人目の『" + subject[j] + "』の点数を入力してください");
				date[i][j] = new Scanner(System.in).nextInt();
			}
			// 改行して見やすく
			System.out.println("\n");
		}
		// 【個人の平均点ゾーン】forを回す
		for(int i = 0;i < menber;i++) {
			// 合計になるものをここで宣言初期化
			double total = 0;
			// forを回す
			for(int j = 0;j<4;j++) {
				// 加える
				total += date[i][j];
			}
			// 合計値を入手したので教科分の4で割って代入
			System.out.println(i+1 +"人目の平均点は" + total/4 + "点です。");
		}
		// 改行して見やすく
		System.out.println("\n");
		// 【教科別ゾーン】forを回す
		for(int j = 0;j<4;j++) {
			// 合計になるものをココで宣言初期化
			double total = 0;
			// forを回す
			for(int i = 0;i<menber;i++) {
				// 加える
				total += date[i][j];
			}
			// 合計値を入手したので人数で割って代入
			System.out.println(subject[j] + "の平均点は" + total/menber + "点です。");
		}
		// 【全体の平均値ゾーン】合計値になるものをココで宣言初期化
		double total = 0;
		// forを回す
		for(int i = 0;i < menber;i++) {
			// forを回す
			for(int j = 0;j<4;j++) {
				// 加える
				total += date[i][j];
			}
		}
		// 合計値を入手したので4と人数で割って全体の平均値を表示
		System.out.println("全体の平均点は"+total/4/menber+"点です。");
	}
}
