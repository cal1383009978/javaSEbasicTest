package com.augeight.test;
/**
 * @author Freelance_Carl
 * @since 2019.08.08
 *@version 1.0
 *@apiNote 继承
 * */
public class Animal {
	
	//构造器
	public Animal() {
		System.out.println("父类的构造器");
		
	}

	public String type;
	
	public int weight;
	
	public int heigtht;
	
	public int age;
	
	//吃
	public void eat() {
		System.out.println("吃饭...");
	}
	
	
	//抢地盘
	public void GrabTerritory() {
		System.out.println("打一架");
	}
	
}
