import java.util.Scanner;
public class Test5{
	public static void main(String[] args){
		/*String level;
		switch(score/10){
			case 10:
			case 9:level = "����";
			case 8:level = "����";
			case 7:level = "�е�";
			case 6:level = "����";
			default:level = "������";
		}
		System.out.println(level);*/
		
		/*System.out.print("����������˰ǰ���ʣ�");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		double minStandrad = 5000;
		double finalSalary = salary - minStandrad;
		double oneMoney = 1000;
		double subSidy = 500;
		double realSalary = 0;
		if(finalSalary<=1500){
			realSalary= finalSalary*0.97 + subSidy -oneMoney + minStandrad;
	    }else if(finalSalary > 1500 && finalSalary<= 4500 ){
		    realSalary= finalSalary*0.90 + subSidy -oneMoney + minStandrad;
        }else if(finalSalary > 4500 && finalSalary<= 9000 ){
		    realSalary= finalSalary*0.80 + subSidy -oneMoney + minStandrad;
		}else if(finalSalary > 9000 && finalSalary<= 35000 ){
		    realSalary= finalSalary*0.75 + subSidy -oneMoney + minStandrad;
		}else if(finalSalary > 35000 && finalSalary<= 55000 ){
		    realSalary= finalSalary*0.70 + subSidy -oneMoney + minStandrad;
		}else{
			realSalary = minStandrad - oneMoney + subSidy;
		}
		
		System.out.print("�����ֹ��ʣ�" + realSalary);*/
		
		/*String nums = "456213587964";
		int oldNum = 0;
		int evenNum = 0;
		 int Num = oldNum+evenNum*3;	
		for(int i=0;i<nums.length();i++)
		{
			if(i%2 == 0){
				oldNum += nums.charAt(i)-'0';
			}else
			{
				evenNum += nums.charAt(i)-'0';
			}
			
			Num = 	oldNum+evenNum*3;
		}
		//System.out.print("������:"+oldNum);
		//System.out.print("ż����:"+evenNum);
		System.out.println("������ż����3��֮��:"+Num);
		double sum1 = Num%10;
		System.out.println("��10ȡ��"+sum1);
		double sum2 = 10-sum1;
		System.out.println("��ʮ��ȥ�����λ��"+sum2);
		double sum3 = sum2%2;
		System.out.println("��2ȡ��"+sum3);*/
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while(num !=-1){
			 System.out.println("������һ������");
			 num = scanner.nextInt();
			 System.out.println("���������Ϊ��"+num);
		}
	}	
}
		