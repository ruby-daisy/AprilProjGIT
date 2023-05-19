package ins.aiite.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		List<Integer> li1=new ArrayList<>();
		List<Integer> li2=new ArrayList<>();		
		List<Integer> li3=new ArrayList<>();
		
		li1.add(1);
		li1.add(2);
		li1.add(3);
		li2.add(4);
		li2.add(5);
		li2.add(6);
		li3.add(7);
		li3.add(8);
		li3.add(9);
		System.out.println(li1);
		System.out.println(li2);
		System.out.println(li3);
		
		List<List<Integer>> list=new ArrayList<>();
		list.add(li1);
		list.add(li2);
		list.add(li3);
		
		for (int x=0;x<list.size();x++)
		{
			for (int y=0;y<li1.size();y++)
			{
				System.out.print(list.get(x).get(y) + " ");
			}
			System.out.println();
		}
		
		

	}

}
