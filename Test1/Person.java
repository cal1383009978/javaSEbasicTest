package com.augeight.test;

/**
 * @author Freelancer_Carl
 * @since 2019.08.08
 * @version 1.0
 * @apiNote ����
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
	
	//���
	int pNo;
	
	//����
	String name;
	
	//�Ա�
	char sex;
	
	//����
	short age;
	
	//���
	boolean isMarry;
	
	//���֤��
	String IDCard;
	
	//��ַ
	String addRess;
	
	//��ϵ��ʽ
	String telNo;
	
	//��ż����
	String partnerName;
	
	//���
	public boolean marry(Person anotherPerson){
		//������22���� Ů����20����
		//����δ��
		//�Ա���벻ͬ
		if(this.age>=(this.sex=='��'?22:20)&&anotherPerson.age>=(anotherPerson.sex=='Ů'?20:22)){
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
