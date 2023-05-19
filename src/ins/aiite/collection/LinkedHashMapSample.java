package ins.aiite.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		
		//follows insertion order
		Map<String,Long> map1 = new LinkedHashMap<>();
		map1.put(null, 1111111111L);
		map1.put("Praveen", 2222222222L);
		map1.put("Pranith", 3333333333L);
		map1.put("Poornima", 44444444444L);
		map1.put("Raam", 5555555555L);
		map1.put("Praveen", 6666666666L);
		map1.put(null, 77777777777L);
		System.out.println(map1);

	}

}
