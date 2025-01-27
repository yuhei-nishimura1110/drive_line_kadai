package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// forを回す
		for(int i = 0; i < 9; i++) {
			// 表示するstring型を宣言初期化
			String s= "";
			// さらにforを回す
			for(int j = 0; j < 20; j++) {
				// sにi*jを書き加える
				s +=String.format("%03d ＊%03d = %03d ", j+1, i+1 ,(i+1)*(j+1));
				// jが19出ないかを確認する
				if(j!=19) {
					// 8でなければ区切りを入れる
					s+="|| ";
				}
			}
			// 一行分表示する
			System.out.println(s);
		}
	}
}
