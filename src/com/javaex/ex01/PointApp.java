package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {
		
		// Object 클래스
		Object obj = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));
		System.out.println("===================");
		
		//getClass()
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass());
		System.out.println("===================");
		
		//hashCode() 객체를 식별할 수 있는 고유한 값
		System.out.println("obj.hashCode()");
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		System.out.println("===================");
		
		//toString() 객체 정보를 문자열로 리턴
		System.out.println("#obj.toString()");
		System.out.println(obj.toString());
		System.out.println("===================");
		
		
		//equals() 두 객체가 같은지 비교 
		System.out.println("#obj.equals()");
		System.out.println(obj01.equals(obj01));
		System.out.println(obj01.equals(obj02));
		System.out.println(obj01==obj01);
		
		
		
	}

}
