package com.augeight.test;

public class Test2 {

	public static void main(String[] args) {
		Person person =new Person(001,"����",'��',(short)22,false,"856210324875211","�ո�","15218761324",null);
		Person person2 =new Person(002,"���",'Ů',(short)24,false,"856210324875211","�ո�","15218762554",null);
		boolean marry = person.marry(person2);
		System.out.println(marry);
		
	}
}
