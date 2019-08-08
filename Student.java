package com.student.test;

public class Student {
    public static void main(String[] args) {
		int a=18;
		double d1=18.00;
		//创建了学生名叫：李白
		Student libai=new Student();
		boolean writeLog=libai.writeLog(null);
		System.out.println(writeLog==true?"写日志了":"没写日志");
	}
    //声明变量
    String stuNo;
    //性别
    char sex;
    //年龄
    short age;
    //身高
    float height;
    //体重
    float weight;
    
    //方法
    //写日志
    //应用数据类型的默认值都是null
    //String=====>>>>null
    //数组默认值====>>>null
    public boolean writeLog(String log) {
    	if(log == null){
    		return false;
    	}else {
    		return true;
    	}
    }
    
    
}
