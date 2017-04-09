package org.graphexamples.snakeladder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadderSolution {
	
	public static int getMinimumMove(int[] move, int N) {
		boolean[] visited= new boolean[N];
		Arrays.fill(visited, false);
		
		Queue queue = new LinkedList();
		
		visited[0] = true;
		QueueEntry qe = new QueueEntry(0,0);
		queue.add(qe);
		
		while(!queue.isEmpty()) {
			qe  = (QueueEntry) queue.peek();
			
			if(qe.getV() == N-1) {
				return qe.getDist();
			}
			
			queue.poll();
			
			for(int i=qe.getV()+1;i<N && i<=qe.getV()+6;i++) {
				if(!visited[i]) {
					QueueEntry qa = new QueueEntry(i, qe.getDist()+1);
					queue.add(qa);
					visited[i]=true;
					
					
					if(move[i] != -1) {
						qa.setV(move[i]);
					} else {
						qa.setV(i);
					}
				}
			}
		}
		return qe.getDist();
	}
}
