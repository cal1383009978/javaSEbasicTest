package com.augeight.test;


/**
 * @author Freelancer_GCC
 * @since 2019.08.08
 * @version 1.0
 * */
public class Circle {

	//������
	public Circle() {
		
		
	}
	//�ṩ����������Բ
	public Circle(Point p,int r) {
		this.p=p;
		this.r=r;
	}
	
	//Բ��
	Point p;
	
	//�뾶
	int r;
	
	//���㵱ǰͼ�ε����
	public double getArea() {
	return Math.PI*this.r*this.r;
	}
	/**
	 *����������֮��ľ���
	 public double getInstance(int x1,int y1) {
		 return Math.sqrt(Math.pow((this.x-x1),2)+Math.pow((this.y-y1),2))
	 }
	 * @param p2
	 * @return
	  */
	
	//���㵱ǰͼ���Ƿ����ָ���ĵ�
	public boolean contains(Point p2) {
		double instance =this.p.getInstance(p2);
		if(instance <= r) {
			return true;
		}else {
			return false;
		}
	}
}
