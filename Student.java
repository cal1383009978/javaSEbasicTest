package com.student.test;

public class Student {
    public static void main(String[] args) {
		int a=18;
		double d1=18.00;
		//������ѧ�����У����
		Student libai=new Student();
		boolean writeLog=libai.writeLog(null);
		System.out.println(writeLog==true?"д��־��":"ûд��־");
	}
    //��������
    String stuNo;
    //�Ա�
    char sex;
    //����
    short age;
    //���
    float height;
    //����
    float weight;
    
    //����
    //д��־
    //Ӧ���������͵�Ĭ��ֵ����null
    //String=====>>>>null
    //����Ĭ��ֵ====>>>null
    public boolean writeLog(String log) {
    	if(log == null){
    		return false;
    	}else {
    		return true;
    	}
    }
    
    
}
