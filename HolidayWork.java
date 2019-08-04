import java.util.*;

public class HolidayWork{
public static void main(String[] args){
	
	//case10 1~100累加但去除个位为3的值
	/*int b = 0;
	for(int i = 1;i<100;i++){
		int c =i%10;
		if(c == 3){
			continue;
		}
			 b = b+i;
		}
	System.out.println(b);
	int sum=0;
	for(int i=1;i<=100;i++){
		if(i%10==3){
			continue;
		}
		sum +=i;
		
	}
	System.out.println(sum);*/
	
	//case8 1000以内所有完数
	/*for(int i=1;i<=1000;i++){
        int sum=0;
        for(int j =1;j<i;j++)
        if(i%j==0)
        sum=sum+j;
        if(sum==i)
     System.out.println(i);
    }*/
	
	//百元买百鸡
	/*int mc;
	int fc;
	int sc;
	int method=0;
	for(mc=0;mc<=20;mc++){
		for(fc=0;fc<=33;fc++){
			for(sc=0;sc<=100;sc++){
				if(sc%3==0){
					if((mc+fc+sc==100)&&(mc*5+fc*3+sc/3==100)){
						method++;
						System.out.println("公鸡："+mc+"只.母鸡："+fc+"只.小鸡："+sc+"只");
					}
				}
			}
		}
	}
	System.out.println("一共"+method+"种方法");*/
	
	/*System.out.println();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("兔子总数:"+f(n));*/
		
		/*System.out.println("请输入围圈总人数:");
			Scanner input = new Scanner(System.in);
			final int n = input.nextInt();
			final int flag = 3;
			List<Integer> mans = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
			mans.add(i + 1);
			}
			System.out.println("初始化编号为" + mans + "的" + mans.size() + "个人围成一圈");
			ListIterator<Integer> iter = null;
			int k = 1;
			do {
			iter = mans.listIterator();
			System.err.println(iter);
			while (iter.hasNext()) {
			int i = iter.next();
			if (k++ % flag == 0) {
			System.out.println("编号" + i + "的人退出圈子");
			iter.remove();
			k = 1;
			}
			}
			} while (mans.size() > 1);
			 
		System.out.println("剩下编号为" + mans + "的" + mans.size() + "个人");*/
		
		//水仙花
		/*for(int i=100;i<1000;i++){
			int result = (int)Math.pow(i/100,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i%10,3);
			if(i==result){
				System.out.println(i);
			}
		}*/
		
		//公司用公用电话传递4位整数的数据，在传递过程中采用如下的加密规则：
		//每个数+5，用和除以10的余数替该数字，将第1位与4位交换，2位与3位互换。
		/*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int first=num%10;
		int sec=num/10%10;
		int third=num/100%10;
		int forth=num/1000;
		first=(first+5)%10;
		sec=(sec+5)%10;
		third=(third+5)%10;
		forth=(forth+5)%10;
		int result=first*1000+third*100+sec*10+forth;
		System.out.print(result);*/
		
		/*String src="统计一个字符在字符串中的所有位置";
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入您所查找的字符：");
		String content=scanner.next();
		char first= content.charAt(0);
		//创建容器 用来存放 匹配字符的位置
		byte[] pos={};
		//charAt() 方法 通过下标拿到String中的每一个字符
		for(int i=0;i<src.length();i++){
			char c=src.charAt(i);
			//拿c与输入字符做比较
			if(c == first){
				//数组扩容
				pos=Arrays.copyOf(pos,pos.length+1);
			    pos[pos.length-1]=(byte)i;
			}
			
		}
		System.out.print(Arrays.toString(pos));*/
		
		//将整数各位翻转
		/*int num = 132312402;
		String changedNum = String.valueOf(num);
		//将String类型 转为 StringBuffer
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		//将StringBuffer转为int类型
		//将StringBuffer转为String
		String str = stringBuffer2.toString();
		//将String转为int类型
		int finalNum =Integer.parseInt(str);
		System.out.print(finalNum);*/
		
		//打印正方形
		/*for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print("* ");
			}
			System.out.println("");*/
			
			//九九乘法表
			/*for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					System.out.print(i+"*"+j+"="+(i*j));
				}
				System.out.println();
			}*/
			
			//打印空心正方形
			/*for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					if(i == 0|| i == 8 ){
						System.out.print("* ");
					}else{
						if(j == 0 || j == 8 ){
							System.out.print("* ");
						}else{
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}*/
			
			//永辉三角形
			/*int[][] a = new int[10][10];
		        for(int i=0;i<10;i++){
				a[i][i] = 1;
				a[i][0] = 1;
				}
				for(int i=2;i<10;i++){
					for(int j=1;j<i;j++){
						a[i][j] = a[i-1][j-1] + a[i-1][j];
					}
				}
				for(int i=0;i<10;i++){
					for(int k=0;k<2*(10-i)-1;k++){
						System.out.print("  ");
					}
					for(int j=0;j<=i;j++){
						System.out.print(a[i][j] + "      ");
					}
					System.out.println();
		       }*/
			   
			   //房子
			   int n = 5;
		       drawHouse(n);
	}
		public static void drawHouse(int n) {
		// 房子上半部
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= 2*n; j++) {
				if (j == n - i + 1) {
				System.out.print("*****");
			} else if (j == n + i - 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		// 房屋下半部，矩形
		// 墙壁 (int) Math.ceil(n * 3 / 5); 向上取整，成比例增高墙壁的高度
		int m = (int) Math.ceil(n * 3 / 5); 
		// m：墙壁高度
		for (int i = 1; i <= m + 2; i++) { 
		//矩形m + 2,，为房屋下半部矩形的总高度
			for (int j = 1; j <= n * 2 + 3; j++) {
				if (i == 1 || i == m + 2) { 
		// 矩形上部，下部
				System.out.print("*");
			} else if (j == 1 || j == n * 2 + 3) { 
		// 墙壁
				System.out.print("*");
			} else {
			System.out.print(" ");
			}
			}
		System.out.println();
		}
		}
    /*public static int f(int n){
        if(n!=1&&n!=2){
        if(n!=3){
        return f(n-1)+f(n-3);
    }
    return 4;
    }else return 2;
	
    }*/
}