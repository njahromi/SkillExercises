package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Driver {

	Node head; // head of list

	public static void main(String[] args) {

		// Starting out with a fresh MyLinkedList

		MyLinkedList cactiList = new MyLinkedList();

		// Starting out with a fresh HashMap

		// Adding Cacti to the List

		cactiList.add("Saguaro");
		cactiList.add("Golden Barrel");
		cactiList.add("Prickly Pear");
		cactiList.add("Organ Pipe");
		cactiList.add("Saguaro");
		cactiList.add("Saguaro");
		cactiList.add("Golden Barrel");

		// Creating a second LinkedList

		MyLinkedList cactiList1 = new MyLinkedList();

		// Adding Cacti to the List

		cactiList1.add("one");
		cactiList1.add("two");
		cactiList1.add("two");
		cactiList1.add("three");
		cactiList1.add("three");
		cactiList1.add("three");
		cactiList1.add("four");
		cactiList1.add("four");
		cactiList1.add("four");
		cactiList1.add("four");

		// Print the LinkedLists to the console

		cactiList1.printList();
		cactiList.printList();

		// Creating an ArrayList

		ArrayList<MyLinkedList> aList = new ArrayList<MyLinkedList>();

		// Adding cactiLists to ArrayList

		aList.add(cactiList);
		aList.add(cactiList1);

		// Creating an empty HashMap object

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// for each MyLinkedList object in aList

		for (MyLinkedList listData : aList) {

			// Defining currNode

			Node currNode = listData.getHead();

			// Traverse the list starting from head of this MyLinkedList object

			// Move through the Linked List, getting each Node Object

			while (currNode != null) {

				// Checking the HashMap to see if the current String is already there

				boolean flag = hm.containsKey(currNode.data);

				// Does the current String already exist in the HashMap?

				System.out.println("Does " + currNode.data + " exist in the HashMap?: " + flag);

				if

				// Adding to HashMap if flag is false

				(flag == false) {

					System.out.println("Adding " + currNode.data + " to the HashMap.");

					// Adding the Node's String data, as well as a default count of one.

					int count = 1;

					hm.put(currNode.data, count);

				} else {

					System.out.println(currNode.data + " already exists in the Hash Map, increasing count by one.");

					// Overwriting the Node's String data, and increasing the count.

					int count = hm.get(currNode.data);

					hm.put(currNode.data, ++count);

				}

				// Get Method

				currNode = currNode.getNext();
			}

		}

		// Printing out the HashMap

		System.out.println("            ");
		System.out.println("Here is the final Hash Map:");

		for (Entry<String, Integer> entry : hm.entrySet()) {
			String key = entry.getKey().toString();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}

	}

}
