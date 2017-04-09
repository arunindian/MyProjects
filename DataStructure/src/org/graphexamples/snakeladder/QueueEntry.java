package org.graphexamples.snakeladder;

public class QueueEntry {
	
	private int v;
	private int dist;
	
	public QueueEntry(int v, int dist) {
		this.v = v;
		this.dist = dist;
	}
	
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int dist) {
		this.dist = dist;
	}
	
	
}
