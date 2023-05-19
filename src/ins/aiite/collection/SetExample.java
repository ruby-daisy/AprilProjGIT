package ins.aiite.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		Set<Integer> st= new HashSet<>();
		st.add(20);
		st.add(50);
		st.add(90);
		st.add(60);
		st.add(200);
		st.add(null);
		System.out.println(st);
		for (Integer eachElement : st) {
			System.out.println(eachElement);
		}
		st.remove(200);
		System.out.println(st);
		System.out.println(st.contains(50));
		
		st.clear();
		st.isEmpty();
		
		
	}

}
