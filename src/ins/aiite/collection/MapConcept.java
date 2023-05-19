package ins.aiite.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {
	public static void main(String[] args) {
		List<String> empNames = new ArrayList<>();
		empNames.add("Ruby");
		empNames.add("Praveen");
		empNames.add("Pranith");
		empNames.add("Saranya");
		empNames.add("Joshah");
		empNames.add("Raam");
		empNames.add("Poornima");
		System.out.println(empNames);
		empNames.remove(3);		
		
		List<Integer> empNo = new ArrayList<>();
		empNo.add(1);
		empNo.add(2);
		empNo.add(3);
		empNo.add(4);
		empNo.add(5);
		empNo.add(6);
		empNo.add(7);
		System.out.println(empNo);
		empNo.remove(3);
		System.out.println(empNames);
		System.out.println(empNo);
		
		Map<String,Long> map1 = new HashMap<>();
		map1.put("Ruby", 1111111111L);
		map1.put("Praveen", 2222222222L);
		map1.put("Pranith", 3333333333L);
		map1.put("Poornima", 44444444444L);
		map1.put("Raam", 5555555555L);
		
		
		System.out.println(map1);
		//retrieve a single value
		System.out.println(map1.get("Ruby"));
		
		//retrieve all key values
		Set<String> keySet = map1.keySet();
		System.out.println(keySet);
		for (String ks : keySet) {
			System.out.println("Name is: " + ks);
		}
		
		System.out.println(map1.keySet());
		//Retrieve all values
		Collection<Long> values = map1.values();
		System.out.println("Number is :" + values);
		
		
		Set<Entry<String,Long>> es = map1.entrySet();
				System.out.println(es);		
		for (Entry<String, Long> entry : es) {
		System.out.println("Name is : " + entry.getKey());
		System.out.println("Ph No is : " + entry.getValue());
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
