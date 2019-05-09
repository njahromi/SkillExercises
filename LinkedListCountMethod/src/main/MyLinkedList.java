//start with head and reach till end counting the number of elements. 
//Then you call count() on all objects in the end and add the sum and print.

//MY LOGICAL APPROACH
// 1) Initialize the count as zero
// 2) Initialize a node pointer, current = head.
// 3) While current isn't null, do the following:
//      a) current = current -> next
//      b) count++;
// 4) Return the count
package main;

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
	
    public int getCountNodesOfList() 
    { 
    	int nodeCount = 0; 
        Node temp = head; 
        while (temp != null) 
        { 
            nodeCount++; 
            temp = temp.next; 
        } 
        return nodeCount; 
    }
    
    // Counts the total number of nodes across all of the LinkedLists, then returns them.
	
    public int getTotalNodes() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
		
		
	}

}
