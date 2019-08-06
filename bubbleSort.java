public class bubbleSort{
	public static void main(String[] args){
		//case14 冒泡序列 
		//基本思想：再要排序的一组数中，
		//对当前还未排好序的范围内的全部数依次进行比较和调整，
		//让较大的数往下沉，较小的数往上冒。
		//即：每当两相邻的数比较落后，发现他们的排序与排序要求相反的，就将他们互换。
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