package main.java.process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Process{
	public String a = "こんにちは！ここは日本です！";
	public String b = "この寿司はうまい";
	public String c = "寿司は和食です";
	public String d;
	public String e(Date date) {
		d = new SimpleDateFormat("yyyy'/'MM'/'dd' 'k':'mm':'ss").format(date);
		return"今の現在日時は" + this.d +"です";
	
	}
}
