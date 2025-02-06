package main.java.execution;

import java.util.Date;

import main.java.process.Process;

public class Execution {
	public static void main(String[] args) {
		
		Process process = new Process();
		System.out.println(process.a);
		System.out.println(process.b);
		System.out.println(process.c);
		Date date = new Date();
		System.out.println(process.e(date));
		
	}
}
