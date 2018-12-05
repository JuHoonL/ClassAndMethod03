package com.biz.classes;

import com.biz.classes.test.MyClass01;
import com.biz.classes.test.MyClass02;
import com.biz.classes.test.MyClass03;
import com.biz.classes.test.MyClass04;
import com.biz.classes.test.MyClass05;
import com.biz.classes.test.MyClass06;
import com.biz.classes.test.MyClass07;
import com.biz.classes.test.MyClass08;

public class ClassExec01 {

	public static void main(String[] args) {
		// 콘솔에 안녕하세요라는 문자열이 나오도록 클래스를 작성해보시오
		MyClass01 m = new MyClass01();
		m.show();

		// list추가후 배열순으로 곱
		MyClass02 m1 = new MyClass02();
		m1.push(10);
		m1.push(20);
		m1.push(30);
		m1.show();
		
		// list추가후 배열 순으로 곱해서 리턴
		MyClass03 m2 = new MyClass03();
		m2.push(10);
		m2.push(20);
		System.out.println(m2.show());
		
		// 문자열을 정수형으로 변환하여 list추가후 배열 순으로 곱해서 리턴
		MyClass04 m3 = new MyClass04();
		m3.push("10");
		m3.push("20");
		System.out.println(m3.show());
		
		// 문자열리스트를 만들어서 그대로 문자열을 합하여 리턴
		MyClass05 m4 = new MyClass05();
		m4.push("10");
		m4.push("20");
		m4.push("30");
		System.out.println(m4.show());
		
		MyClass06 m5 = new MyClass06();
		m5.push(10);
		m5.push(20);
		m5.push(30);
		System.out.println(m5.show());
		
		MyClass07 m6 = new MyClass07();
		m6.insert("대한민국");
		m6.show();
		
		MyClass08 m7 = new MyClass08();
		m7.show('A','F');
		m7.show00('A','F');
	}

}
