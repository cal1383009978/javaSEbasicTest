public class HolidayHomework {
    public static void main(String[] args) {
        //case2 打印实心正方形
        for(int i=1;i<=9;i++) {
        //控制实心正方形的行
            for(int j=1;j<=9;j++) {
        //控制实心正方形的列
                System.out.print("@"+" ");
            }
            System.out.println();
        }
        // case4 打印空心正方形
        for(int k=1;k<=11;k++) {
            if(k>1&&k<11) {
                System.out.println("*                   *");
            }else {
            System.out.println("* * * * * * * * * * *");
            }
        }
		
		for(int i = 1;i < 10;i++){
			for(int j = 1;j <=i;j++){
			    System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	
   }
}


 import java.util.*;
public class HolidayHomework {
	public static void main(String []args){
		//case9 小球的弹力
		//小球高度
		double h = 100;
		//l经过多少米
		double l = 0;
		//i为小球回弹的次数
		for(int i=1;i<=10;i++){
			l+=h*Math.pow(0.5,i)*3;
		}System.out.print(l);
	}
} 	
  //case6 合并数组
  int []A={1,7,9,11,13,15,17,19}; 
		 int []B={2,4,6,8,10}; 
		 int []C=new int[13]; 
		 int i; 
		 for(i=0;i<A.length;i++){ C[i]=A[i];}
		 for(i=0;i<B.length;i++) {C[i+8]=B[i]; }
		 Arrays.sort(C); 
		 System.out.println(Arrays.toString(C));*/
		 
import java.util.*;
public class HolidayHomework {
	public static void main(String []args){		 
		int b1,b2,b3;
		for(int m=100;m<999;m++){
			b3=m/100;
			b2=m%100/10;
			b1=m%10;
			if((b3*b3*b3+b2*b2*b2+b1*b1*b1)==m){
				System.out.println(m+"是一个水仙花数");
			} 	 
		}
	}
} 	



	