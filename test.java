package com.student.test;

import java.util.Arrays;
import java.util.Random;

public class test {
	public static void main(String[] args) {
     // System.out.println("give me to ur heart");
      //��������
      int[] arrays = {2,48,35,13,854,59};
      Arrays.sort(arrays);
      System.out.println(Arrays.toString(arrays));
      //1s = 1000ms
      //�õ�1970-01-01 00:00:00 ->���ڵĺ���ֵ
      long currentTimeMillis = System.currentTimeMillis();
      System.out.println(currentTimeMillis);
      //��ǰСʱ
      //1565085217268/1000/60/60
      //int ���ֵ  long
      System.out.println(Integer.MAX_VALUE);
      //int ��Сֵ
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Long.MAX_VALUE);
      System.out.println(Long.MIN_VALUE);
      
      //�����
      Random random = new Random();
      for(int i=0;i<50;i++){
    	  int nextInt= random.nextInt(50);
    	  System.out.println(nextInt);
      }
      
	}

}
