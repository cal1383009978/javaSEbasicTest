package com.augeight.test;

public class SingleQuestion extends Question{

	//扩展功能
	//标准答案
	String answer;
	
	@Override
	public boolean checkAnswer(String[] answers) {
		//首先判断答案是否合法
		if(answers.length!=1){
			return false;
		}
		return this.answer.equals(answers[0]);
	}
}
