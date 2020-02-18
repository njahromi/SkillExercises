package com.infy.assignment.concurrency;

public class Task implements Runnable {

	public static void main(String[] args) {
		
		
		Task task1 = new Task(1);
		Task task2 = new Task(2);

	}

	private int counter;

	public Task(int counter) {
		this.counter = counter;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int incrementCtr() {
		return counter++;
	}

	@Override
	public void run() {
		incrementCtr();
		System.out.println("Counter value:" + counter);

	}
}