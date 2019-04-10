package main;

public class Node {

	String data;
	Node next;
	
	//The Constructor

	Node(String s) {
		data = s;
		next = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
