import java.util.*;
public class Test8{
	public static void main(String[] args){
		String nums = "692116851128";
		int oldNum=0;
		int evenNum=0;
		int Num=oldNum+evenNum*3;
		for(int i=0;i<nums.length();i++)
		{
			if(i%2 == 0){
				oldNum += nums.charAt(i)-'0';
			}else{
				evenNum += nums.charAt(i)-'0';
			}	
			Num=oldNum+evenNum*3;
		}
		System.out.println("��������:"+oldNum);
		System.out.println("��ż����:"+evenNum);
		System.out.println("��������ż������֮��:"+Num);
		int sum = Num%10;
		System.out.println("��10ȡ��:"+sum);
		int sum1 = 10 -sum;
		System.out.println("��10��ȥ�����:"+sum1);
		int sum2 = sum1%10;
		System.out.println("��10ȡ��"+sum2);
		
		String nums = "123456789012";
		int oldNum = 0;
		int evenNum = 0;
		for(int i =0;i < nums.length();i++)
		{
			if(i%2 == 0)
			{
				oldNum += nums.charAt(i)-'0';
			}else
			{
			    evenNum += nums.charAt(i)-'0';	
			}
		
		}
		System.out.println("����֮��"+oldNum);
		System.out.println("ż��֮��"+evenNum);
		
		byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		newArray[newArray.length-1] =100;
		System.out.println(Arrays.toString(newArray));
		
		int[] src = {1,2,3,4};
		int[] dest = new int[4];
		System.arraycopy(src,0,dest,0,src.length);
		System.out.println(Arrays.toString(dest));
		
		int[] src = {0,2,5,8};
		int[] dest = Arrays.copyOf(src,src.length);
		System.out.println(Arrays.toString(dest));
		
		char[] arr =  {'I','v'};
		char[] temp = Arrays.copyOf(arr,4);
		System.out.println(temp);
		char[] newArr = temp;
		newArr[2] = 'u';
		newArr[3] = 'm';
		System.out.println(newArr);
		
		String str = "ͳ��һ���ַ����ַ����е�����λ��.";
		int[] ary = countAll(str,'��');
		System.out.println(Arrays.toString(ary));
		
		
		
	}
		public static int[] countAll(String str,char ch){
			int[] ary = {};
			for(int i=0;i<str.length();i++){
				char c = str.charAt(i);
				if(c==ch){
					ary = Arrays.copyOf(ary,ary.length+1);
					ary[ary.length-1] = i;
				}
			}
			return ary;
		}
		
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		char ch = '��';
		int[] ary = countAll(chs,ch);
		System.out.println(Arrays.toString(ary));*/
		
		System.out.println("��ת56123Ϊ:"+rev(56123));
    }		
	public static int[] countAll(char[] chs,char ch){
	int[] ary = {};
	for(int i=0;i<chs.length;i++){
		char c = chs[i];
		if(c==ch){
			ary = Arrays.copyOf(ary,ary.length+1);
			ary[ary.length-1] = i;
			}
	}
		return ary;
	}
	
	
	public static int rev(int num){
		int num1 = 0;
		while(true){
			int last = num%10;
			num1 = num1*10+last;
			num = num/10;
			if(num==0){
				break;
			}
		}
		return num1;
	}
}