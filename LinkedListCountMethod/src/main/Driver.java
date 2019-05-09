package main;

public class Driver {

	public static void main(String[] args) {

		// Starting out with a Fresh List

		MyLinkedList cactiList = new MyLinkedList();

		// Adding Cacti to the List

		cactiList.add("Saguaro");
		cactiList.add("Golden Barrel");
		cactiList.add("Prickly Pear");
		cactiList.add("Organ Pipe");

		//Creating a second LinkedList
		
        MyLinkedList cactiList1 = new MyLinkedList();

        // Adding Cacti to the List

        cactiList1.add("one");
        cactiList1.add("two");
        cactiList1.add("three");
        cactiList1.add("four");
        
     // Print the LinkedLists to the console

        cactiList1.printList();
        cactiList.printList();

	}


}
