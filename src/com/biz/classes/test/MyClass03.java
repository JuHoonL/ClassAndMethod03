package com.biz.classes.test;

import java.util.ArrayList;
import java.util.List;

public class MyClass03 {

	List<Integer> intps ; 
	
	public MyClass03() {
		intps = new ArrayList(); 
	}
	
	public void push(int intN) {
		intps.add(intN);
	}
		
	public int show() {
		int intMul = 1;
		for(int i : intps) {
			intMul *= i;
		}
		return intMul;
	}
}
