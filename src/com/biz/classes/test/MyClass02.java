package com.biz.classes.test;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	List<Integer> intps ; 
	
	public MyClass02() {
		intps = new ArrayList(); 
	}
	
	public void push(int intN) {
		intps.add(intN);
	}
		
	public void show() {
		int intMul = 1;
		for(int i : intps) {
			intMul *= i;
		}
		System.out.println(intMul);
	}
}
