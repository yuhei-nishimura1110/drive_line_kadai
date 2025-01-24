package question;

public class Question1_4_1_8 {
	public static void main(String[] args) {
		// 1
		
		
		// バイト型を宣言
		byte b;
		// 短整数型を宣言
		short s;
		// 整数型を宣言
		int i;
		//　長整数型を宣言
		long l;
		// 単精度浮動小数点数型を宣言
		float f;
		// 倍精度浮動小数点数型を宣言
		double d;
		// 文字型を宣言
		char c;
		// 文字列型を宣言
		String S;
		// ブーリアン型を宣言
		boolean o; 
		
		
		
		// 2
		
		
		// バイト型に初期値を代入
		b = 0;
		// 短整数型に初期値を代入
		s = 0;
		// 整数型に初期値を代入
		i = 0;
		//　長整数型に初期値を代入
		l = 0L;
		// 単精度浮動小数点数型に初期値を代入
		f = 0.0f;
		// 倍精度浮動小数点数型に初期値を代入
		d = 0.0;
		// 文字型に初期値を代入
		c = '\u0000';
		// 文字列型に初期値を代入
		S = null;
		// ブーリアン型に初期値を代入
		o = false;
		
		
		// 3
		
		// バイト型に10を代入
		b = 10;
		// 短整数型に100を代入
		s = 100;
		// 整数型に1000を代入
		i = 1000;
		// 長整数型に10000を代入
		l = 10000L;
		// 単精度浮動小数点数型に9.5を代入
		f = 9.5f;
		// 倍精度浮動小数点数型に10.5を代入
		d = 10.5;
		// 文字型にaを代入
		c = 'a';
		// 文字列型にハローを代入
		S = "ハロー";
		// ブーリアン型にtrueを代入
		o = true;
		
		
		// 4
		// long型を宣言、初期化して11110になるように計算
		long l41 = b + s + i + l;
		// 11110を表示
		System.out.println(l41);
		
		// double型を宣言、初期化して20になるように計算
		double d42 = f + d;
		// 20をintに直して表示
		System.out.println((int) d42);
		
		// String型を宣言、初期化してa ハロー trueになるように計算
		String S43 = c + " " + S + " " + o;
		// a ハロー trueを表示
		System.out.println(S43);
		
		// double型を宣言、初期化して11130になるように計算
		double d44 = b + s + i + l + f + d;
		// 11130をintに直して表示
		System.out.println((int)d44);
		
		// long型を宣言、初期化して10000000000になるように計算
		long l45 = b * s * i * l;
		// 10000000000を表示
		System.out.println(l45);
		
		// double型を宣言、初期化して0.105になるように計算
		double d46 = d / s;
		// 0.105を表示
		System.out.println(d46);
		
		// int型を宣言、初期化して-90になるように計算
		int i47 = b - s;
		// -90を表示
		System.out.println(i47);
		System.out.println("");
		
		
		
		// 5
		// パターン1
		// Stringをintに変えてしまう
		// intで宣言に変更
		int num=20;
		// 
		int num1=23;
		
		System.out.println("ハローJAVA"+(num+num1));
		
		// パターン2
		// Stringを無理やりintに捻じ曲げる
		
		String num3="20";
		int num4=23;
		// StringをInteger.valueOfを使ってint型に変更して計算したうえで表示
		System.out.println("ハローJAVA"+(Integer.valueOf(num3)+num4));
		System.out.println("");
		
		
		// 6&7
		// 名前をString型で宣言初期化
		String name = "山田太郎";
		// 年齢をint型で宣言初期化
		int age = 18;
		// 身長をdouble型で宣言初期化
		float height = 170.5f;
		// 体重をdouble型で宣言初期化
		float weight = 62.2f;
		// 好きな食べ物をString型で宣言初期化
		String food = "寿司";
		// nameinfoメソッドを起動
		nameinfo(name,age,height,weight,food);
		System.out.println("");
		
		
		// 8
		// name情報を書き換え
		name = "鈴木一郎";
		// age情報を書き換え
		age = 24;
		// height情報を書き換え
		height = 168.5f;
		// weight情報を書き換え
		weight = 64.2f;
		// food情報を書き換え
		food = "オムライス";
		// nameinfoメソッドを起動
		nameinfo(name,age,height,weight,food);
		System.out.println("");
		
		
		// 9
		//　年齢,身長,体重を2倍にしてnameinfoメソッドを起動
		nameinfo(name,age*2,height*2,weight*2,food);
		System.out.println("");
		
		
		// 10
		// 25歳以上ならtrueを出力する。そうでなければfalseを出力する。
		System.out.println(25 <= age);
		System.out.println("");
		
		
		// 11
		
		// 年齢のStringverを定義初期化
		String agest = String.valueOf(age);
		// 身長のStringverを定義初期化
		String heightst = String.valueOf(height);
		// 体重のStringverを定義初期化
		String weightst = String.valueOf(weight);
		
		System.out.println(agest + heightst + weightst);
		System.out.println("");
		
		
		//12
		//年齢をintに戻す
		int ageint = Integer.valueOf(agest);
		//年齢を出力
		System.out.println(ageint);
		//身長を一旦float型に落とす
		float heightflo = Float.valueOf(heightst);
		//身長をintにする
		int heightint = (int)heightflo;
		// 身長を出力
		System.out.println(heightint);
		System.out.println("");
		
		
		//13
		// 年齢が25である。もしくは身長が160以上である場合にtrueを出力する。
		System.out.println(ageint == 25 || heightint >= 160);
		
	}
	
	
	
	
	// [概要]　個人情報を出力処理
	// [詳細]　引数として名前、年齢、身長、体重、好きな食べ物を受け取りコンソールにそれぞれ適切な文字列で出力する。また、BMIを計算し出力する。
	public static void nameinfo(String name, int age, float height, float weight, String food) {
		// 名前を表示
		System.out.println("始めまして" + name + "です");
		// 年齢を表示
		System.out.println("年齢は" + age + "歳です");
		// 身長を表示
		System.out.println("身長は" + height + "cmです");
		// 体重を表示
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物を表示
		System.out.println("好きな食べ物は" + food + "です");
		// BMIを表示
		System.out.println("BMIは" + weight / height / height *10000 +"です");
		
		
		
	}
}
