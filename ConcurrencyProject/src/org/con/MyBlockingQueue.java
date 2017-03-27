package org.con;

import java.util.LinkedList;
import java.util.List;


/**
 * 
 * A blocking queue blocks where a thread tries to dequeue from it and it is empty 
 * OR tries to enqueue something to it and it is full
 * 
 * @author dixit
 *
 */
public class MyBlockingQueue<T> {
	
	private List<T> queue = new LinkedList<>();
	private int limit;
	
	public MyBlockingQueue(int limit) {
		this.limit = limit;
	}
	
	public synchronized void enqueue(T t) throws InterruptedException {
		if(this.queue.size() == this.limit) {
			wait();
		}
		if(this.queue.size() == 0) {
			notifyAll();
		}
		this.queue.add(t);
	}
	
	public synchronized T dequeue() throws InterruptedException {
		if(this.queue.size() == 0) {
			wait();
		}
		if(this.queue.size() == this.limit) {
			notifyAll();
		}
		return this.queue.remove(0);
	}
}
