package ins.aiite.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListToArray {
	
	public static void main(String[] args)
	{
		
		List <Integer> arr=new LinkedList<>();
		arr.add(10);
		arr.add(89);
		arr.add(30);
		arr.add(76);
		arr.add(55);
		
		Integer[] arrList1=new Integer[arr.size()];
		//using for loop
		for(int i=0;i<arr.size();i++)
		{
			arrList1[i]=arr.get(i);
		}
		for (Integer arrElement : arrList1) {
			//System.out.println(arrElement);
		}
		
		//using toArray()		
		 Integer[] array = arr.toArray(new Integer[arr.size()]);
		 for (Integer parr : array) {
			System.out.println(parr);
		}
		
		}		
		
		
		
		
		
		
		
		
		
	
	
	
	

}
