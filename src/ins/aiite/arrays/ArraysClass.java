package ins.aiite.arrays;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		
		int[] arr= {100,20,60,70,30,10};	
		System.out.println(Arrays.toString(arr));
		System.out.println("Before Sort");
		for (int i=0;i<arr.length;i++)			
		{
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("After Sort");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}		
		//toString() - print the array values without using loop
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.hashCode(arr));
		
		boolean[] bool= {true,false,true,true,false};
		System.out.println(Arrays.toString(bool));
		
		
		
	}

}
