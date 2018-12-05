package com.biz.classes.test;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {

	List<String> strps ; 
	
	public MyClass06() {
		strps = new ArrayList(); 
	}
	
	public void push(int intN) {
//		String strN = String.valueOf(intN);
		String strN = "" + intN;
		strps.add(strN);
	}
		
	public String show() {
		String strNum = "";
		for(String i : strps) {
			strNum += i;
		}
		return strNum;
	}
	
	List<Integer> intps ; 
	
	public void push01(int intN) {
		intps.add(intN);
	}
		
	public String show01() {
		String strNum = "";
		for(int i : intps) {
			strNum += i;	// 문자열에 숫자를 계속 더하면 자동으로 문자열로 취급됌
		}
		return strNum;
	}
}
