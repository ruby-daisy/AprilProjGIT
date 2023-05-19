package ins.aiite.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		Integer[] arr = new Integer[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		List<Object> li = new ArrayList<>(Arrays.asList(arr));
		System.out.println(li);
		li.add(400);
		li.add(500);
		li.add(600);
		System.out.println(li);
		}

}
