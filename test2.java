package com.student.test;

import java.util.Arrays;
import java.util.Random;

public class test2 {

	public static void main(String[] args){
		
		//测试我们写的排序和系统排序
	      int[] arrs = new int[30000];
	      Random r = new Random();
	      for (int i = 0;i<arrs.length;i++){
	    	  arrs[i] = r.nextInt();
	      }
	      int[] a = Arrays.copyOf(arrs,arrs.length);
	      int[] b= Arrays.copyOf(arrs,arrs.length);
	      
	      long start = System.currentTimeMillis();
	      Arrays.sort(a);
	      long end = System.currentTimeMillis();
	      System.out.println("系统API所花时间:"+(end-start));
	      
	      
	      
	      long start2 = System.currentTimeMillis();
	      chooseSort(b);
	      long end2 = System.currentTimeMillis();
	      System.out.println("选择排序所花时间:"+(end2-start2));
	}


//选择排序的方法
    public static int[] chooseSort(int[] b){
    	int[] nums={5,21,5,46,5,53,484,5,2,1,64,8,321,151};
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]>b[j]){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		return b;
    }
}
