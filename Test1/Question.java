package com.augeight.test;
/**
 * @author Freelance_Carl
 * @since 2019.08.08
 * @version 1.0
 * @apiNote继承_选择题
 * */
public class Question {

	//题号
	public int id;
	
	//题干
	public String text;
	
	//选项
	public String[] options;
	
	//检查答案的方法
	public boolean checkAnswer(String[] answers){
		return false;
	}
	
	//打印题目到控制台
	public void printText(){
		System.out.println("题号:"+id+"---题干"+"text");
		for(int i=0;i<options.length;i++){
			System.out.print(options[i]);
		}
	}
}
