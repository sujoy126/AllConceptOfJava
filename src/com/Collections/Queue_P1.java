package com.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_P1 {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.add(10);
		pq.add(30);
		pq.add(43);
		System.out.println("Before using peek() & poll() in Queue : "+pq);
		System.out.println("peek() fetch the first object of Queue by using peek() : "+pq.peek());
		System.out.println("After using peek() : "+pq);
		System.out.println("poll() fetch the fist objet and remove it from the queue by using poll() : "+pq.poll());
		System.out.println("After using poll() & displying the data : "+pq);
	}

}
