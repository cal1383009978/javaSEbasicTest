package com.augeight.test;
/**
 * @author Rocky_GCC
 * @version 7.0
 * @since 2019.08.07
 * */
public class Point {
	
	//构造器特点 不能声明返回值类型 与类同名
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//方法重载
	//方法重载有如下规则：
	//a 方法名一样
	//b 方法参数列表不一样
	//重载方法也可以说是，方法名一样，方法签名不同的方法
	public Point(int c) {
		//调用本类的其他构造
		//Constructor call must be the first statement in a constructor
		this(c,c);
	}
	
	//显示声明
	//public Point() {
		
	//}
	int x;
	
	int y;
	
	//The constructor Point() is undefined
	public static void main(String[] args) {
		Point point1 = new Point(1);
 		System.out.println(point1.x);
		System.out.println(point1.y);
	}
	public double getInstance(Point p2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getInstance1(Point p2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
