package ins.aiite.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		List<Object> li1 = new ArrayList<>();//version 1.8	
		List<Object> li = new ArrayList<>();
		li.add(10);
		li.add("Daisy");
		li.add('F');
		li.add(40000);
		li.add(80.06f);
		li.add("Daisy");
		li.add(600000);
		li.add("Daisy");
		li.add(70);	
		li.add("Daisy");
		li.add("Ruby");
		for (Object listValue : li) {
			System.out.println(listValue);			
		}
			
		li.add(2,"Ruby");		
		System.out.println(li);		
		System.out.println("Size of List is " + li.size());		
		System.out.println("Candidate full name is: " + li.get(1) +" " + li.get(2));
		li.set(0, "ST01");		
		li.remove(7);
		System.out.println("Index of a value Daisy : " + li.indexOf("Daisy"));		
		System.out.println("Last Index of a value Daisy : " + li.lastIndexOf("Daisy"));
		
		
		List<Object> stDetail=li.subList(2, 7);
		System.out.println("Sublist Example: "+ stDetail);	
	//	stDetail.clear();
		System.out.println("Sublist Example: "+ stDetail);	
		
		li1.add("B.sc.");
		li1.add("M.Sc.");
		li1.add("M.Phil");
		System.out.println(li1);	
		System.out.println(li);	
		li1.addAll(li);
		System.out.println(li);	
		for(int i=0;i<li.size();i++)
		{
			System.out.println("List Item Print using for loop" + li.get(i));
		}
		
		Object arr[]=new Object[li.size()];		
		arr=li.toArray();
		System.out.println("List to Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		arr[10]="ABC";
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		li.add("ABC");
		System.out.println(li);	
	}
	
	
	

}
