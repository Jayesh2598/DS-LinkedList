package com.capg.ds;

public class MyQueue {
	
	private MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode node) {
		myLinkedList.append(node);
	}

	public INode dequeue() {
		return myLinkedList.pop();
	}

	public void printQueue() {
		myLinkedList.printNodes();
	}

	public INode peek() {
		return myLinkedList.getHead();
	}
	
}
