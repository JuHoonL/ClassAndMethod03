package com.biz.classes.test;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {

	List<String> strNum1;
	String[] sptN ;
	
	public MyClass07() {
		strNum1 = new ArrayList();
	}
	
	public void insert(String strN) {
		sptN = strN.split("");
		for(int i = 0 ; i < sptN.length ; i ++) {
			strNum1.add(sptN[i] + ",");
		}
	}
	
	public void show() {
		for(String s : strNum1) {
			System.out.print(s);
		}
		System.out.println("-" + sptN.length + "글자");
	}
	
	
	public void insert00(String strN) {
		sptN = strN.split("");
	}
	
	public void show00() {
		for(String s : sptN) {
			System.out.print(s+",");
		}
		System.out.println("-" + sptN.length + "글자");
	}

}
