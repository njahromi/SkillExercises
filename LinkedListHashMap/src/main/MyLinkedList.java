package main;

import java.util.HashMap;

public class MyLinkedList {

	private Node head;
	private static int totalCount = 0;

	// Method to insert a new node

	public void add(String data) {

		// Creating a new node with provided data

		Node new_node = new Node(data);

		// Make the new node a head if the LinkedList is empty

		if (head == null) {
			head = new_node;
		} else {

			// Or else move across the list to the end, and insert a new node there

			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}

			// This will place the new_node at last node

			last.setNext(new_node);
		}

	}

	// Counts the number of nodes in the LinkedList, then returns them.

	public int getCountNodesOfList() {
		int nodeCount = 0;
		Node temp = head;
		while (temp != null) {
			nodeCount++;
			temp = temp.next;
		}
		return nodeCount;
	}

	// Counts the total number of nodes across all of the LinkedLists, then returns
	// them.

	public int getTotalNodes() {
		Node temp = head;
		while (temp != null) {
			totalCount++;
			temp = temp.next;
		}
		return totalCount;
	}

	// Method that prints out the list of Cacti

	public void printList() {
		Node currNode = head;

		System.out.print("Here's a linked list ");

		// Move through the Linked List

		while (currNode != null) {

			// Print the data at the current node to the console

			System.out.print(currNode.getData() + ", ");

			// Jump to the next node

			currNode = currNode.getNext();

		}

		System.out.println("The total number of all the objects in the list is -> " + getCountNodesOfList() + ".");

		System.out.println("The total number of list entries is: " + getTotalNodes());
	}

	// Method that adds objects of Node to HashMap

	public void toMap(HashMap<String, Integer> cactiMap) {
		Node currNode = head;

		// Move through the Linked List

		while (currNode != null) {

			// With each MyNode object you get inside this while loop, you will call
			// getData() on that object.

			currNode.getData();

			// After getting that string data, you will put it in cactiMap object.

			cactiMap.put(currNode.getData(), currNode.stringCount());

			// Jump to the next node

			currNode = currNode.getNext();

		}
	}

}
