package main;

import java.util.ArrayList;
import java.util.List;

public class ListFun {

	public static void main(String[] args) {

		// creating a list

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 1); // adds 1 at 0 index
		l1.add(1, 2); // adds 2 at 1 index
		System.out.println(l1);

		// creating another list

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);

		// will add List l2 from 1 index

		l1.addAll(1, l2);

		// removes element from index 1

		l1.remove(1);
		System.out.println(l1);

		// prints element at index 3

		System.out.println(l1.get(3));

		// replace 0th element with 5

		l1.set(0, 5);

		System.out.println(l1);

	}

}
