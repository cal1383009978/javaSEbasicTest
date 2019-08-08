package com.augeight.test;

public class Dog extends Animal {

	//扩展
	public void swim() {
		System.out.println("游泳");
	}
	
	//方法重写 方法名 参数列表都一致 方法体不一致 发生在继承关系中的
	//重写
	//注解
    @Override
	public void GrabTerritory() {
		System.out.println("通过法律来抢地盘");
	}
	
	
}
