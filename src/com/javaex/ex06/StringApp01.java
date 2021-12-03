package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {

		String str01 = new String("hi");
		String str02 = new String("hi");	
		
		System.out.println(str01 == str02);		// 서로 다른 주소
		System.out.println(str01.hashCode());	// 문자열이 같으면 해시코드 같음. String 클래스에서 재정의됨
		System.out.println(str02.hashCode());
		
		System.out.println("===========================");
		String str03 = "hello";
		String str04 = "hello"; 				// str03과 같은 주소
		System.out.println(str03 == str04); 	//true
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
		str03 = "hello!!!!";  					// str03 새로 할당
		System.out.println(str03 == str04);		// false
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
		System.out.println(str04);				// str04.toString() 
		System.out.println(str04.toString());	// String 클래스에서 재정의됨
	}

}
