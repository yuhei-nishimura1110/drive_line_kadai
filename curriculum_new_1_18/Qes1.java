package curriculum_new_1_18;

public class Qes1 {
	public static void main(String[] args) {
		//1
		//qes1を起動
		qes1("Hello",11);
		
		//2
		//qes24を起動
		qes24(new java.util.Random().nextInt(100)+1,new java.util.Random().nextInt(100)+1);
		
		//3
		//qes3を起動
		int[] x = {new java.util.Random().nextInt(100)+1,
				new java.util.Random().nextInt(100)+1,
				new java.util.Random().nextInt(100)+1,
				new java.util.Random().nextInt(100)+1,
				new java.util.Random().nextInt(100)+1};
		qes3(x);
		
		//4
		//qes24を起動
		qes24(new java.util.Random().nextDouble(),new java.util.Random().nextDouble());
		
		qes7(qes6(qes5(new java.util.Random().nextInt(100)+1)));
		
	}
	// 【概要】表示処理
	// 【詳細】文字列と整数を引数に持ちそれらを表示する
	public static void qes1(String st,int i) {
		System.out.println(st + "JavaSE" + i);
	}
	
	// 【概要】乗算処理
	// 【詳細】二つの引数を取りそれらを掛けて表示する。
	public static void qes24(int a,int b) {
		System.out.println(a * b);
	}
	
	// 【概要】表示処理
	// 【詳細】配列で受け取りforでまわして表示させる
	public static void qes3(int[] a) {
		for(int x:a) {
			System.out.println(x);
		}
	}
	
	// 【概要】和算処理
	// 【詳細】小数二つを引数にとりそれらを足して表示する
	public static void qes24(double a,double b) {
		System.out.println(a + b);
	}
	
	// 【概要】乱数代入出力処理
	// 【詳細】引数分の整数を生成してそれらを代入、出力する
	public static int[] qes5(int a) {
		// 配列を定義
		int[] ints = new int[a];
		// forを回して乱数を代入
		for(int i = 0;i<ints.length;i++) {
			ints[i] = new java.util.Random().nextInt(100);
			
		}
		// forを回してコンソールに出力
		for(int i:ints) {
			System.out.println(i);
		}
		// 配列を戻り値として返す。
		return ints;
	}
	
	// 【概要】配列平均出力処理
	// 【詳細】配列を受け取り、平均値を出力して戻り値として返す処理を行う。
	public static double qes6(int[] a) {
		// 合算する変数を定義初期化
		int x = 0;
		// forを回して合算していく
		for(int i:a) {
			x+=i;
		}
		// doubleで平均値を定義初期化。
		double y = Double.valueOf(x)/a.length;
		// 平均値をコンソールに出力
		System.out.println(y);
		// 平均値を返す。
		return y;
	}
	
	// 
	// 
	public static void qes7(double a) {
		// 
		System.out.println(a>50 ? true : false);
	}
}
