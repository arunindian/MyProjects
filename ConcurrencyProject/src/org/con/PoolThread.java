package org.con;

public class PoolThread<T extends Runnable> extends Thread{
	
	private MyBlockingQueue<T> queue;
	private boolean isStopped = false;
	
	public PoolThread(MyBlockingQueue<T> queue) {
		this.queue = queue;
	}
	
	public void run() {
		while(!isStopped()) {
			try{
				Runnable r = queue.dequeue();
				r.run();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isStopped() {
		return isStopped;
	}

	public synchronized void doStop() {
		this.isStopped = true;
		this.interrupt();
	}
	
}
