public class bubbleSort{
	public static void main(String[] args){
		//case14 ð������ 
		//����˼�룺��Ҫ�����һ�����У�
		//�Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ�������ν��бȽϺ͵�����
		//�ýϴ�������³�����С��������ð��
		//����ÿ�������ڵ����Ƚ���󣬷������ǵ�����������Ҫ���෴�ģ��ͽ����ǻ�����
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4};
		int temp=0;
		for(int i=0;i<a.length-1-i;i++){
			for(int j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}