package ins.aiite.collection;

import java.util.ArrayList;
import java.util.List;

public class RetainAllSample {

	public static void main(String[] args) {
		List<Object> li = new ArrayList<>();
		li.add(10);
		li.add("Daisy");
		li.add('F');
		li.add(40000);
		li.add(80.06f);	
		li.add(600000);	
		li.add(70);		
		
		List<Object> li1 = new ArrayList<>();
		li1.add(10);
		li1.add("Daisy");
		li1.add('F');
		System.out.println(li);
		System.out.println(li1);
		li.retainAll(li1);		
		System.out.println(li);
		System.out.println(li1);
		

	}

}
