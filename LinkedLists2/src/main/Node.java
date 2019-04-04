package main;

public class Node {

       public Node(Node head) {
              super();
       }

       String data;
       Node next;

       Node(String s) {
              data = s;
              next = null;
       } // constructor

       public void setHead(Node head) {
       }

       public Node getNext() {
              return next;
       }

       public void setNext(Node nextValue) {
              next = nextValue;
       }

       public String getData() {
              return data;
       }

}
