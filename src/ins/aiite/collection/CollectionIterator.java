package ins.aiite.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterator {

	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("apple");
        myArrayList.add("banana");
        myArrayList.add("cherry");

        Iterator<String> iterator = myArrayList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

	}

}
