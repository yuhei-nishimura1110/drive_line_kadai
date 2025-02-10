package curriculum29.qes29Main;

public class Qes29Main {
	public static void main(String[] args) {
		// 配列作成
		String date = "北海道:札幌市:83424,青森県:青森市:9646,岩手県:盛岡市:15275,宮城県:仙台市:7282,秋田県:秋田市:11638,山形県:山形市:9323,福島県:福島市:13784,茨城県:水戸市:6097,栃木県:宇都宮市:6408,群馬県:前橋市:6362,埼玉県:さいたま市:3798";
		String[] tdfk = date.split(",");
		String[][] dates = new String[11][3];
		for(int i = 0; i < 11; i++) {
			String[] s = tdfk[i].split(":");
			for(int j = 0; j < 3; j++) {
				dates[i][j] = s[j];
			}
		}
		// 検索する値を入力してもらい、分けて配列にいれる
		System.out.println("検索する値を入力してください。");
		String s = new java.util.Scanner(System.in).nextLine();
		String[] st = s.split(",");
		// 仮の配列を作り、正規の表記であれば代入して代入した数をcountで数える
		String[] kari = new String[st.length];
		int count = 0;
		for(String sts :st) {
			switch(sts) {
			case "0","1","2","3","4","5","6","7","8","9","10"->{
				kari[count] = sts;
				count++;
			}
			}
		}
		// 仮の配列を元に必要最低限の配列を作り正しい値を代入する。
		int[] ints = new int[count];
		for(int i = 0; i < count;i++) {
			ints[i] = Integer.valueOf(kari[i]);
		}
		// 昇順または降順を入力してもらう。変な値を入れられた場合には昇順で動くように制御。
		System.out.println("昇順または降順と入力ください。");
		String js =new java.util.Scanner(System.in).nextLine();
		// processを、間違えないように生成。
		curriculum29.process.Process process = new curriculum29.process.Process(dates,ints,js);
	}
}
