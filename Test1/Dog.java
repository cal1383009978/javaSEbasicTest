package com.augeight.test;

public class Dog extends Animal {

	//��չ
	public void swim() {
		System.out.println("��Ӿ");
	}
	
	//������д ������ �����б�һ�� �����岻һ�� �����ڼ̳й�ϵ�е�
	//��д
	//ע��
    @Override
	public void GrabTerritory() {
		System.out.println("ͨ��������������");
	}
	
	
}
