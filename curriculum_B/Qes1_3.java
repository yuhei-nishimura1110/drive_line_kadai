package curriculum_B;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {
	public static void main(String[] args) {
		// この文は確認テストを終えたら消す。
		
		// 1　無印
		// 2 〇
		// 3 □
		// 名前を入力してもらう
		System.out.println("名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		// ユーザー名が10文字より少ないか確認する。
		if(name.length() > 10) {
			// ユーザーを短くするようコメントを表示する
			System.out.println("名前を10文字以内にしてください");
		// 文字数が0ornullでないか確認する
		}else if(name == null || name.isEmpty()) {
			// 名前を入力するようコメントを表示する
			System.out.println("名前を入力してください");
		// 〇ユーザー名が半角かどうか確認する〇
		}else if(!Pattern.compile("^[A-Za-z0-9]+$").matcher(name).matches()){
			// 〇半角英数字で表示するように促す。〇
			System.out.println("半角英数字のみで名前を入力してください");
		}else {
			// ユーザー名を登録しましたと表示する
			System.out.println("ユーザー名「" + name +"」を登録しました。");
			int re = 1;
			//do-while文を書く.条件はじゃんけんに勝っていること
			do {
				// 自分の手を決定する
				int myHand =new java.util.Random().nextInt(3);
				// 相手の手を決定する
				int yourHand = new java.util.Random().nextInt(3);
				// 自分の手を表示する
				hand(myHand,name);
				// 相手の手を表示する
				hand(yourHand,"相手");
				// 勝ち負けを計算する
				switch(myHand - yourHand) {
				case 0 ->{
					// 同じ場合はあいこになる。
					System.out.println("DRAW あいこ もう一回しましょう！\n ");
				}
				case 2,-1 ->{
					// 勝った場合の表示をする
					System.out.println("やるやん。\n次は俺にリベンジさせて\n ");
					// 勝つまでにかかった回数を表示する
					System.out.println("勝つまでにかかった合計回数は" + re +"回です");
					// -1を代入してreを++で1追加して結果的に0にしてループを止める
					re = -1;
				}
				case -2 ->{
					// ぱーで負けた時の処理を表示する
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n ");
				}
				case 1 ->{
					// 自分の手がグーの時を絞りだす
					if(myHand == 0) {
						// グーで負けた時の処理を表示する
						System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n ");
					}else {
						// ちょきで負けた時の処理を表示する。
						System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n ");
					}
				}
				}
				// 回数を計算する。
				re++;
			}while(re > 0);
		}
	}
	// 【概要】手を表示処理
	// 【詳細】手を決める数字と誰が出したのかを引数で受け取り誰が何をだしたのかを表示する。
	public static void hand(int num ,String who) {
		// どれを出したのかで区別する
		switch(num) {
		case 0->{
			// グーを出した場合
			System.out.println(who + "の手は「グー」");
		}
		case 1 ->{
			// チョキを出した場合
			System.out.println(who + "の手は「チョキ」");
		}
		case 2->{
			// パーを出した場合
			System.out.println(who + "の手は「パー」");
		}
		}
	}
}
