package com.student.test;

import java.util.Arrays;
import java.util.Random;

public class test {
	public static void main(String[] args) {
     // System.out.println("give me to ur heart");
      //创建数组
      int[] arrays = {2,48,35,13,854,59};
      Arrays.sort(arrays);
      System.out.println(Arrays.toString(arrays));
      //1s = 1000ms
      //拿到1970-01-01 00:00:00 ->现在的毫秒值
      long currentTimeMillis = System.currentTimeMillis();
      System.out.println(currentTimeMillis);
      //当前小时
      //1565085217268/1000/60/60
      //int 最大值  long
      System.out.println(Integer.MAX_VALUE);
      //int 最小值
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Long.MAX_VALUE);
      System.out.println(Long.MIN_VALUE);
      
      //随机数
      Random random = new Random();
      for(int i=0;i<50;i++){
    	  int nextInt= random.nextInt(50);
    	  System.out.println(nextInt);
      }
      
	}

}
