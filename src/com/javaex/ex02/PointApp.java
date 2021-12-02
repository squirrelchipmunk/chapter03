package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,5);
		
		System.out.println("#getClass()");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("=============================");
		
		System.out.println("#hashCode()");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("=============================");
		
		System.out.println("#toString()");	// 재정의
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("=============================");
		
		System.out.println("#equals()");	// 재정의
		System.out.println(p00.equals(p02));
		System.out.println(p00.equals(p01));
		System.out.println(p00==p01);
		Point p03 = p02;
		System.out.println(p02.equals(p03));
		System.out.println(p02==p03);
		System.out.println("=============================");
		
		
		
		
	}

}
