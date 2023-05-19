package ins.aiite.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		Map<String,Long> map1 = new HashMap<>();
		//allows one null key 
		map1.put(null, 1111111111L);
		map1.put("Praveen", 2222222222L);
		map1.put("Pranith", 3333333333L);
		map1.put("Poornima", 44444444444L);
		map1.put("Raam", 5555555555L);
		map1.put("Praveen", 6666666666L);
		map1.put(null, 77777777777L);
		System.out.println(map1);
		
		//doesnot allow null
		Map<String,Long> map2 = new Hashtable<>();
		map2.put("Raam", 1111111111L);
		map2.put("Praveen", 2222222222L);
		map2.put("Pranith", 3333333333L);
		map2.put("Poornima", 44444444444L);
		map2.put("Raam", 5555555555L);
		System.out.println(map2);
		
		
		
		
		
	}

}
