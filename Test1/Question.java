package com.augeight.test;
/**
 * @author Freelance_Carl
 * @since 2019.08.08
 * @version 1.0
 * @apiNote�̳�_ѡ����
 * */
public class Question {

	//���
	public int id;
	
	//���
	public String text;
	
	//ѡ��
	public String[] options;
	
	//���𰸵ķ���
	public boolean checkAnswer(String[] answers){
		return false;
	}
	
	//��ӡ��Ŀ������̨
	public void printText(){
		System.out.println("���:"+id+"---���"+"text");
		for(int i=0;i<options.length;i++){
			System.out.print(options[i]);
		}
	}
}
