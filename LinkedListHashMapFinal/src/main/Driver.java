package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
				
				boolean flag = hm.containsValue(currNode);
	
				// Printing the current String
				
				System.out.println("The current Node is " + currNode.data);
				
				System.out.println("Does " + currNode.data + " exist in the HashMap?: " + flag);

				// Get Method

				currNode = currNode.getNext();
			}

			// }

			// for each Node object in this list

			for (MyLinkedList nodeData : aList) {

				// get the String data for this MyNode object

				Node currData = nodeData.head;

			}
		}

			/*
			 * the purpose now is to put this string data in the HashMap along with the
			 * count of how many times it is appearing
			 */

			// First check if this string data already exists in the HashMap or not

			// how do you check that?? 
			

			// if not found, then store this string and value 1 in the HashMap


				/*
				 * if found, that means there is an object in the HashMap which has this string
				 * value as the key, and an integer value which is the count of the number of
				 * times, this string has appeared so far in this HashMap
				 */

			// how do you get the count of that string data from HashMap??


			// you will now increase the count value by 1


			
			// and then put it back in HashMap


			// how do you put value back in HashMap??

			/*
			 * HashMap is a data structure in which you are able to store key-value pairs.
			 * It essential that the key is unique. Otherwise you overwrite the value that
			 * has the same key. That being said, to add data back into the HashMap, you
			 * simply need to overwrite an existing key with an identical key with the new
			 * value.
			 */

		}

		// Printing Results of HashMap:


	private static String currNode(ArrayList<MyLinkedList> aList) {
		String data = null;
		return data;

	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

}
