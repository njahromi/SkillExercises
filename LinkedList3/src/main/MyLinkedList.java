package main;

public class MyLinkedList {

       private static MyNode head;
	private static MyNode String;
	public static void main(String[] args) {
    	   
    	   MyLinkedList flavors = new MyLinkedList();

              // I'm using the add method to add some items to the list
              
              MyLinkedList.head = new MyNode("Vanilla");

              flavors.add("Neapolitan");
              flavors.add("Rainbow Sherbet");
              flavors.add("Cookies & Cream");
              flavors.add("Mocha Chip");
              flavors.add("Rum Raisin");
              
              //This is the String S constructor you told me to build in the email
              
              
              //This is checking to see if head is null or not, then assigning newNode to it
              if (head == null) {
                  new MyNode(String);
              }
              while ((head.next != null)) {
                  head = head.next;
              }
              
              head.next = new MyNode(String("s"));

           System.out.println(flavors.toString());
       }

	private static MyNode String(java.lang.String s) {
		return null;
	}

	public String toString() {
                   String result = "";
                   MyNode head = String("Vanilla");
                   MyNode current = head;
                   while(current.getNext() != null){
                       result += current.getData();
                       if(current.getNext() != null){
                            result += ", ";
                       }
                       current = current.getNext();
                   }
                   return "Today's Flavors: " + result;
       }

	//This will append the specified flavor to the end of this list.
       public void add(java.lang.String string2) {

			// Initialize Node only in case of 1st element

              }

              MyNode flavorsTemp = new MyNode(String);
              MyNode flavorsCurrent = head; {

              if (flavorsCurrent != null) {

                     //Starting from the head node, head to the end of the list and append nodes
                     while (flavorsCurrent.getNext() != null) {
                           flavorsCurrent = flavorsCurrent.getNext();
                     }

                     //The "next" of the previous node refers to our newest node
                     flavorsCurrent.setNext(flavorsTemp);
              }

       }


}