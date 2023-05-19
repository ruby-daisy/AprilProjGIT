package ins.aiite.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSetSample {

	public static void main(String[] args) {
		
		// performed to remove duplicates from the list
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(30);
		li.add(40);
		li.add(60);
		li.add(30);
		li.add(40);
		li.add(10);
		
		System.out.println(li);
		
		Set<Integer> set=new HashSet<>();
		set.addAll(li);		
		System.out.println(set);
		
		//hashset class and hasmap  class donot have any readymade methods to fetch the
		//elements in a particular sequence
		
		// to allow duplicates in a set we convert it into list
		Set<String> setString=new HashSet<>();
		setString.add("abc");
		setString.add("abc");
		setString.add("abc");
		setString.add("abc");
		setString.add("abc");
		setString.add("abc");
		 System.out.println(setString);
		 List<String> li1=new ArrayList<>();
		 li1.addAll(setString);
		 System.out.println(li1);
		 li1.add("abc");
			li1.add("abc");
			 System.out.println(li1);
		 
		 
		 
		
		
		

	}

}
