package ins.aiite.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffTypes {

	public static void main(String[] args) {
		List<Object> li = new ArrayList<>();
		li.add(10);
		li.add("Daisy");
		
		Set<Integer> st = new HashSet<>();
		st.add(30);
		st.add(40);
		System.out.println(li);
		System.out.println(st);

		li.addAll(st);
		System.out.println(li);
		System.out.println(st);

	}

}
