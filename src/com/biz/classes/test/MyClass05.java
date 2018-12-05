package com.biz.classes.test;

import java.util.ArrayList;
import java.util.List;

public class MyClass05 {

	List<String> strps ; 
	
	public MyClass05() {
		strps = new ArrayList(); 
	}
	
	public void push(String strN) {
		strps.add(strN);
	}
		
	public String show() {
		String strNum = "";
		for(String i : strps) {
			strNum += i;
		}
		return strNum;
	}
	
	// 원시적방법
	String strNum = "";
	
	public void push01(String strN) {
		strNum += strN ;
	}
	
	public String show01() {
		return strNum;
	}
}
