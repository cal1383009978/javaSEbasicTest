import java.util.*;
public class ChooseSort{
	public static void main(String[] args){
		int[] nums={5,21,5,46,5,53,484,5,2,1,64,8,321,151};
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(nums));
	}
}