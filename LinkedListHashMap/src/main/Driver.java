package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Driver {

	private static Node head;

	public static void main(String[] args) {

		// Starting out with a fresh MyLinkedList

		MyLinkedList cactiList = new MyLinkedList();

		// Starting out with a fresh HashMap

		HashMap<String, Integer> cactiMap = new HashMap<String, Integer>();

		// Adding Cacti to the List

		cactiList.add("Saguaro");
		cactiList.add("Golden Barrel");
		cactiList.add("Prickly Pear");
		cactiList.add("Organ Pipe");

		cactiList.toMap(cactiMap);

		// Creating a second LinkedList

		MyLinkedList cactiList1 = new MyLinkedList();

		// Adding Cacti to the List

		cactiList1.add("one");
		cactiList1.add("two");
		cactiList1.add("three");
		cactiList1.add("four");

		cactiList1.toMap(cactiMap);

		// Print the LinkedLists to the console

		cactiList1.printList();
		cactiList.printList();

		// The StringCount method body

		// Our current node is the front of the LinkedList (the head)
		Node currNode = head;
		int count = 1;

		while (currNode != null) {

		}
		
		
		// Setting thisStr to the first String in a LinkedList

		String thisStr = currNode.getData();

		// Putting the String + count of the occurrence of the String into cactiMap

		cactiMap.put(thisStr, count);

		// Getting the next node

		currNode = currNode.getNext();
		
		
	}

	// String Count Method Declaration
		
	

	
	
	
	

	// Method to print CactiMap

	// Method Declaration on cactiMap
	
	public static void printMap(HashMap<String, Integer> cactiMap) {
		
		// Creating an iterator:

		Iterator<Entry<String, Integer>> it = cactiMap.entrySet().iterator();
		
		// Setting up a while loop.  The loop continues until it runs out of entries in the HashMap.

		while (it.hasNext()) {
			
			// Returns the next element in the iteration
			
			Entry<String, Integer> pair = it.next();
			
			// Printing out the cactiMap based on it's keys + values
			
			System.out.println(pair.getKey() + " = " + pair.getValue());
			
			// Removing the iterator avoids a ConcurrentModificationException
			
			it.remove();

		}

	}
}
