package ins.aiite.collection;

import java.util.ArrayList;
import java.util.List;
public class ToArrayConcept {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();		
		li.add(400);
		li.add(500);
		li.add(600);
		System.out.println(li);				
		Object[] intArray=li.toArray();
		for (Object arr : intArray) {
			System.out.println(arr);
			
		}
		
		//old type casting
		Integer[] intList=new Integer[li.size()];
		intList=(Integer[]) li.toArray();
		for(int i=0;i<intList.length;i++) {
			System.out.println(intList[i]);
		}
		

	}

}
