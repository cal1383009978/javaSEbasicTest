package com.augeight.test;

/**
 *@author Freelancer_GCC 
 * @apiNote ������
 * 
 * */
public class Test {
	
	
	public static void main(String[] args) {
		Point p = new Point(1,1);
		Circle circle = new Circle(p,1);
		
		//���Ե��Ƿ���Բ�ڻ���Բ��
		Point point = new Point(2,2);
		boolean contains = circle.contains(point);
		System.out.println(contains);
		
	}

}
