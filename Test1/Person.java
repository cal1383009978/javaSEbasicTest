package com.augeight.test;

/**
 * @author Freelancer_Carl
 * @since 2019.08.08
 * @version 1.0
 * @apiNote 人类
 * */
public class Person{
	
	
	public Person(int pNo,String name,char sex,short age,boolean isMarry,String iDCard,String addRess,String telNo,String partnerName){
		this.pNo=pNo;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.isMarry=isMarry;
		IDCard=iDCard;
		this.addRess=addRess;
		this.telNo=telNo;
		this.partnerName=partnerName;
	}
	
	//编号
	int pNo;
	
	//姓名
	String name;
	
	//性别
	char sex;
	
	//年龄
	short age;
	
	//婚否
	boolean isMarry;
	
	//身份证号
	String IDCard;
	
	//地址
	String addRess;
	
	//联系方式
	String telNo;
	
	//配偶姓名
	String partnerName;
	
	//结婚
	public boolean marry(Person anotherPerson){
		//男需满22周岁 女需满20周岁
		//都是未婚
		//性别必须不同
		if(this.age>=(this.sex=='男'?22:20)&&anotherPerson.age>=(anotherPerson.sex=='女'?20:22)){
			if(this.isMarry == false && anotherPerson.isMarry==false){
				if(this.sex!= anotherPerson.sex){
					this.isMarry=true;
					anotherPerson.isMarry=true;
					this.partnerName = anotherPerson.name;
					anotherPerson.partnerName=this.name;
					return true;
					
				}
			}
		}
	   return false;
	}
}
