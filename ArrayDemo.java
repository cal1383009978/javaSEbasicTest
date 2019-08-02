import java.util.*;

public class ArrayDemo{
	public static void main(String[] args){
		byte[] nums = {1,5,7,9,10};
		byte[] nums2 = new byte[5];
		nums2[0] = 10;
		nums2[1] = 50;
		//byte[] nums3 = new byte[]{
		//	1,5,7,9,10
		//};
		/*for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}*/
		//System.out.print(nums[5]);
		//System.out.print(nums2[1]);
		//System.out.print(nums3[1]);
		//System.out.print(nums2[0]);
		
		/*byte[] bytes = {1,5,7,9,10};
		byte[] bytes2 = new byte[bytes.length];
		for(int i =0;i<bytes.length;i++){
			bytes2[i] = bytes[i];
		}
		
		System.out.println("bytes的第一位"+bytes[0]);
		System.out.println("bytes2的第一位"+bytes2[0]);
		bytes[0] = 100;
		System.out.println("bytes的第一位"+bytes[0]);
		System.out.println("bytes2的第一位"+bytes2[0]);
		
		//Arrays.toString();
		System.out.print(Arrays.toString(bytes));*/
		
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = new byte[++sourceArray.length];
		for(int i =0;i<sourceArray.length;i++){
			newArray[i] = soueceArray[i];
		}
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));*/
		
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = new byte[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.print(Arrays.toString(newArray));*/
		
		/*byte[] sourceArray = {1,5,7,9,10};
		//byte[] newArray= Arrays.copyOf(sourceArray,5);
		byte[] newArray= Arrays.copyOf(sourceArray,2);
		System.out.print(Arrays.toString(newArray));*/
		
		byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));
		
	}
}
		