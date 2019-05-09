package main;

public class Node {

	static String data;
	Node next;

	// The Constructor

	Node(String s) {
		data = s;
		next = null;
	}

	public static String getData() {
		return data;
	}

	public void setData(String data) {
		Node.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
