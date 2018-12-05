package com.biz.classes.test;

public class MyClass08 {

	public void show(char c1, char c2) {
		for(int i = c1 ; i <= c2 ; i++) {
			System.out.print(((char)i) + " ");
		}
		System.out.println();
	}
	
	public void show00(char c1, char c2) {
		String s = "";
		for(int i = c1 ; i <= c2 ; i++) {
			s += (char)i+" " ;
		}
		System.out.println(s);
	}
}
