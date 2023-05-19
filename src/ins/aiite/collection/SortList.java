package ins.aiite.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(50);
		li.add(30);
		li.add(100);
		li.add(10);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);		
		Collections.reverse(li);
		System.out.println(li);
		System.out.println("Least Value is: " +Collections.min(li));
		System.out.println("Maximum Value is: " +Collections.max(li));		

	}

}
