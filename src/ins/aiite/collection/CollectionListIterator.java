package ins.aiite.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionListIterator {

	public static void main(String[] args) {
		 // Create an ArrayList of String
        ArrayList<String> names = new ArrayList<>();

        // Add some names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Get a ListIterator for the ArrayList
        ListIterator<String> iterator = names.listIterator();

        // Iterate over the ArrayList using the ListIterator
        System.out.println("Forward iteration:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Iterate over the ArrayList in reverse using the ListIterator
        System.out.println("\nReverse iteration:");
        while (iterator.hasPrevious()) {
            String name = iterator.previous();
            System.out.println(name);
        }
	}

}
