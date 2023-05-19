package ins.aiite.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {

	public static void main(String[] args) {
		
		Map<String,Long> map1 = new HashMap<>();
		map1.put("Ruby", 1111111111L);
		map1.put("Praveen", 2222222222L);
		map1.put("Pranith", 3333333333L);
		System.out.println(map1);
		
		Map<String,Long> map2 = new HashMap<>();		
		map2.put("Poornima", 44444444444L);
		map2.put("Raam", 5555555555L);
		map2.put("Daisy", 3333333333L);
		System.out.println(map2);		
		
		List<Map<String,Long>> liMap=new ArrayList<Map<String,Long>>();
		liMap.add(map1);
		liMap.add(map2);
		System.out.println(liMap.get(0).get("Ruby"));
		System.out.println(liMap.get(1).get("Daisy"));	
		
		System.out.println("length od list is " + liMap.size());
		
	}

}
