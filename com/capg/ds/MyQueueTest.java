package com.capg.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyQueueTest {
	
	@Test
	public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue queue = new MyQueue();
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		INode firstAddedNode = queue.dequeue();
		assertEquals(myFirstNode, firstAddedNode);
	}
}
