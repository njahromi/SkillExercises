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

		// Print the LinkedList to the console

		cactiList.printList(cactiList);
	}


}
