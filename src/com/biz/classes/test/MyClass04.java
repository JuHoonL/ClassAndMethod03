package com.biz.classes.test;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	List<Integer> intps ; 
	
	public MyClass04() {
		intps = new ArrayList(); 
	}
	
	public void push(String strN) {
		int intN = Integer.valueOf(strN);
		intps.add(intN);
//		intps.add(Integer.valueOf(strN));		
	}
		
	public int show() {
		int intMul = 1;
		for(int i : intps) {
			intMul *= i;
		}
		return intMul;
	}
}
