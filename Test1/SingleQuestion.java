package com.augeight.test;

public class SingleQuestion extends Question{

	//��չ����
	//��׼��
	String answer;
	
	@Override
	public boolean checkAnswer(String[] answers) {
		//�����жϴ��Ƿ�Ϸ�
		if(answers.length!=1){
			return false;
		}
		return this.answer.equals(answers[0]);
	}
}
