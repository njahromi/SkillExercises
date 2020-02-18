package main;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Create a linked List
 * 
 * Insert 5 cities in it - Sydney, Melbourne, Brisbane, Perth, Canberra
 * 
 * Insert another city after Sydney that is Alice Springs
 * 
 * Print all the cities from start with each city in a new line. 
 * 
 * Hint: add(index, value) Use this to insert city in between.
 */

public class Main {
    public static void main(String[] args) {
    	String name;
    	LinkedList<String> placesToVisit = new LinkedList<String>();
    	placesToVisit.add("Sydney");
    	placesToVisit.add("Melbourne");
    	placesToVisit.add("Brisbane");
    	placesToVisit.add("Perth");
    	placesToVisit.add("Canberra");
    	placesToVisit.add(1, "Alice Springs");
    	
    	System.out.println(placesToVisit.toString());
    }
    private static void printList(LinkedList<String> linkedList) {
    	
    }
}

