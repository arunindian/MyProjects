package org.con;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author dixit
 *
 * 
 */
public class ThreadPool<T extends Runnable> {
	
	private MyBlockingQueue<T> taskQueue;
	private List<PoolThread<T>> threads = new ArrayList<>();
	private boolean isStopped = false;
	
	public ThreadPool(int noOfThreads, int maxNoOfTasks) {
		this.taskQueue = new MyBlockingQueue<>(maxNoOfTasks);
		for(int i=0;i < maxNoOfTasks ;i++) {
			threads.add(new PoolThread<>(taskQueue));
		}
		for(Thread thread : threads) {
			thread.start();
		}
	}
	
	public synchronized void execute(T t) throws Exception {
		if(this.isStopped) {
			throw new Exception("Thread pool already stopped.");
		}
		this.taskQueue.enqueue(t);
	}
	
	public synchronized void stop() {
		this.isStopped = true;
		for(PoolThread<T> t: threads) {
			t.doStop();
		}
	}
}
