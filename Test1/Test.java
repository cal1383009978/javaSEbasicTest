package com.augeight.test;

/**
 *@author Freelancer_GCC 
 * @apiNote 测试类
 * 
 * */
public class Test {
	
	
	public static void main(String[] args) {
		Point p = new Point(1,1);
		Circle circle = new Circle(p,1);
		
		//测试点是否在圆内还是圆外
		Point point = new Point(2,2);
		boolean contains = circle.contains(point);
		System.out.println(contains);
		
	}

}
