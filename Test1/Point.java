package com.augeight.test;
/**
 * @author Rocky_GCC
 * @version 7.0
 * @since 2019.08.07
 * */
public class Point {
	
	//�������ص� ������������ֵ���� ����ͬ��
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//��������
	//�������������¹���
	//a ������һ��
	//b ���������б�һ��
	//���ط���Ҳ����˵�ǣ�������һ��������ǩ����ͬ�ķ���
	public Point(int c) {
		//���ñ������������
		//Constructor call must be the first statement in a constructor
		this(c,c);
	}
	
	//��ʾ����
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
