package com.augeight.test;


/**
 * @author Freelancer_GCC
 * @since 2019.08.08
 * @version 1.0
 * */
public class Circle {

	//构造器
	public Circle() {
		
		
	}
	//提供构造器构建圆
	public Circle(Point p,int r) {
		this.p=p;
		this.r=r;
	}
	
	//圆心
	Point p;
	
	//半径
	int r;
	
	//计算当前图形的面积
	public double getArea() {
	return Math.PI*this.r*this.r;
	}
	/**
	 *计算两个点之间的距离
	 public double getInstance(int x1,int y1) {
		 return Math.sqrt(Math.pow((this.x-x1),2)+Math.pow((this.y-y1),2))
	 }
	 * @param p2
	 * @return
	  */
	
	//计算当前图形是否包含指定的点
	public boolean contains(Point p2) {
		double instance =this.p.getInstance(p2);
		if(instance <= r) {
			return true;
		}else {
			return false;
		}
	}
}
