package main;

public class MyLinkedList {

	private Node head;

	// Method to insert a new node

	public MyLinkedList add(String data) {

		// Creating a new node with provided data

		Node new_node = new Node(data);
		new_node.setNext(null);

		// Make the new node a head if the LinkedList is empty

		MyLinkedList cactiList = new MyLinkedList();
		if (cactiList.head == null) {
			cactiList.head = new_node;
		} else {

			// Or else move across the list to the end, and insert a new node there

			Node last = cactiList.head;
			while (last.getNext() != null) {
				last = last.getNext();
			}

			// This will place the new_node at last node

			last.setNext(new_node);
		}

		// Return the list of cacti by head

		return null;

	}
	// Method that prints out the list of Cacti

	public void printList(MyLinkedList cactiList) {
		Node currNode = cactiList.head;

		System.out.print("Cacti List: ");

		// Move through the Linked List

		while (currNode != null) {

			// Print the data at the current node to the console

			System.out.print(currNode.getData() + " ");

			// Jump to the next node

			currNode = currNode.getNext();

		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

}
