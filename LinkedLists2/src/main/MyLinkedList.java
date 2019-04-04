package main;

public class MyLinkedList {

       Node head;

       public static void main(String[] args) {

              MyLinkedList flavors = new MyLinkedList();

              // I'm using the add method to add some items to the list
              
              flavors.head = new Node("Vanilla");

              flavors.add("Neapolitan");
              flavors.add("Rainbow Sherbet");
              flavors.add("Cookies & Cream");
              flavors.add("Mocha Chip");
              flavors.add("Rum Raisin");

           System.out.println(flavors.toString());
       }

       public String toString() {
                   String result = "";
                   Node current = head;
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
       public void add(String data) {

              // Initialize Node only in case of 1st element
              if (head == null) {
                     head = new Node(head);
              }

              Node flavorsTemp = new Node(data);
              Node flavorsCurrent = head;

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
