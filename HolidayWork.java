import java.util.*;

public class HolidayWork{
public static void main(String[] args){
	
	//case10 1~100�ۼӵ�ȥ����λΪ3��ֵ
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
	
	//case8 1000������������
	/*for(int i=1;i<=1000;i++){
        int sum=0;
        for(int j =1;j<i;j++)
        if(i%j==0)
        sum=sum+j;
        if(sum==i)
     System.out.println(i);
    }*/
	
	//��Ԫ��ټ�
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
						System.out.println("������"+mc+"ֻ.ĸ����"+fc+"ֻ.С����"+sc+"ֻ");
					}
				}
			}
		}
	}
	System.out.println("һ��"+method+"�ַ���");*/
	
	/*System.out.println();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("��������:"+f(n));*/
		
		/*System.out.println("������ΧȦ������:");
			Scanner input = new Scanner(System.in);
			final int n = input.nextInt();
			final int flag = 3;
			List<Integer> mans = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
			mans.add(i + 1);
			}
			System.out.println("��ʼ�����Ϊ" + mans + "��" + mans.size() + "����Χ��һȦ");
			ListIterator<Integer> iter = null;
			int k = 1;
			do {
			iter = mans.listIterator();
			System.err.println(iter);
			while (iter.hasNext()) {
			int i = iter.next();
			if (k++ % flag == 0) {
			System.out.println("���" + i + "�����˳�Ȧ��");
			iter.remove();
			k = 1;
			}
			}
			} while (mans.size() > 1);
			 
		System.out.println("ʣ�±��Ϊ" + mans + "��" + mans.size() + "����");*/
		
		//ˮ�ɻ�
		/*for(int i=100;i<1000;i++){
			int result = (int)Math.pow(i/100,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i%10,3);
			if(i==result){
				System.out.println(i);
			}
		}*/
		
		//��˾�ù��õ绰����4λ���������ݣ��ڴ��ݹ����в������µļ��ܹ���
		//ÿ����+5���úͳ���10������������֣�����1λ��4λ������2λ��3λ������
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
		
		/*String src="ͳ��һ���ַ����ַ����е�����λ��";
		Scanner scanner=new Scanner(System.in);
		System.out.print("�������������ҵ��ַ���");
		String content=scanner.next();
		char first= content.charAt(0);
		//�������� ������� ƥ���ַ���λ��
		byte[] pos={};
		//charAt() ���� ͨ���±��õ�String�е�ÿһ���ַ�
		for(int i=0;i<src.length();i++){
			char c=src.charAt(i);
			//��c�������ַ����Ƚ�
			if(c == first){
				//��������
				pos=Arrays.copyOf(pos,pos.length+1);
			    pos[pos.length-1]=(byte)i;
			}
			
		}
		System.out.print(Arrays.toString(pos));*/
		
		//��������λ��ת
		/*int num = 132312402;
		String changedNum = String.valueOf(num);
		//��String���� תΪ StringBuffer
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		//��StringBufferתΪint����
		//��StringBufferתΪString
		String str = stringBuffer2.toString();
		//��StringתΪint����
		int finalNum =Integer.parseInt(str);
		System.out.print(finalNum);*/
		
		//��ӡ������
		/*for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print("* ");
			}
			System.out.println("");*/
			
			//�žų˷���
			/*for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					System.out.print(i+"*"+j+"="+(i*j));
				}
				System.out.println();
			}*/
			
			//��ӡ����������
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
			
			//����������
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
			   
			   //����
			   int n = 5;
		       drawHouse(n);
	}
		public static void drawHouse(int n) {
		// �����ϰ벿
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
		// �����°벿������
		// ǽ�� (int) Math.ceil(n * 3 / 5); ����ȡ�����ɱ�������ǽ�ڵĸ߶�
		int m = (int) Math.ceil(n * 3 / 5); 
		// m��ǽ�ڸ߶�
		for (int i = 1; i <= m + 2; i++) { 
		//����m + 2,��Ϊ�����°벿���ε��ܸ߶�
			for (int j = 1; j <= n * 2 + 3; j++) {
				if (i == 1 || i == m + 2) { 
		// �����ϲ����²�
				System.out.print("*");
			} else if (j == 1 || j == n * 2 + 3) { 
		// ǽ��
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